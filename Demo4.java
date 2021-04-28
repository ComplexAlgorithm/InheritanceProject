import java.util.Scanner;
public class Demo4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Person [] csc201Array = new Person[26]; 
		int studentIndex = 1;
		int option; 
		
		do {
			System.out.println("Press 1 to assign a professor to the class");
			System.out.println("Press 2 to register a new student for the class");
			System.out.println("Press 3 to look at everyone in the class including the professor");
			System.out.println("Press 4 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); //go to the next line
			
			if(option == 1) {
				System.out.println("What is the name of the professor?");
				String name = keyboard.nextLine();
				
				System.out.println("What is the employee id of the professor?");
				int employeeId = keyboard.nextInt();
				keyboard.nextLine(); //go to the next line
				
				System.out.println("What is the department of the professor?");
				String department = keyboard.nextLine(); 
				
				Faculty newProfessor = new Faculty(name,employeeId,department);
				
				csc201Array[0] = newProfessor; //places the professor object into the array
			}
			else if(option == 2) {
				System.out.println("What is the name of the new student?");
				String name = keyboard.nextLine();
				
				System.out.println("What is the student id of the new student?");
				int studentId = keyboard.nextInt();
				keyboard.nextLine(); //go to the next line
				
				Student newStudent = new Student(name,studentId);
				
				if(studentIndex < csc201Array.length) {
					//to determine if this student is already registerd for the class
					boolean alreadyRegistered = false;
					int index = 1;
					while(alreadyRegistered == false && index < studentIndex) {
						if(csc201Array[index].equals(newStudent)) {
							alreadyRegistered = true;
						}
						else {
							index++;
						}
					}
					
					if(!alreadyRegistered) {
						csc201Array[studentIndex] = newStudent;
						studentIndex++;
					}
					else {
						System.out.println("This student is already registered for the class!");
					}
				}
				else {
					System.out.println("The class is full and student could not be added!");
				}
			}
			else if(option == 3) {
				if(csc201Array[0] != null) {
					System.out.println(csc201Array[0].toString());
				}
				else {
					System.out.println("No professor has been assigned yet!");
				}
				for(int index = 1; index < studentIndex; index++) {
					System.out.println(csc201Array[index].toString());
				}
			}
			else if(option == 4) {
				System.out.println("Thank you for using the program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 4);
	}

}

