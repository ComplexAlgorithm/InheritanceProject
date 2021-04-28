import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Person currentPerson = null; //reference to a person object
		Employee currentEmployee = null;  //reference to an employee object
		Faculty currentFaculty = null; //reference to a faculty object
		
		int option;
		
		do {
			System.out.println("Press 1 to add a new Person");
			System.out.println("Press 2 to add a new Employee");
			System.out.println("Press 3 to add a new Faculty");
			System.out.println("Press 4 to view all information");
			System.out.println("Press 5 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); //go to the next line
			
			if(option == 1) {
				//System.out.println("What is the name of the new Person?");
				//String name = keyboard.nextLine();
				//currentPerson = new Person(name);
			
				currentPerson = new Person();
				enterName(currentPerson);
			}
			else if(option == 2) {
				//System.out.println("What is the name of the new Employee?");
				//String name = keyboard.nextLine();
				
				//System.out.println("What is the employee id of the new Employee?");
				//int employeeId = keyboard.nextInt();
				
				//currentEmployee = new Employee(name,employeeId);
				
				currentEmployee = new Employee();
				enterName(currentEmployee);
				enterEmployeeId(currentEmployee);
			}
			else if(option == 3) {
				//System.out.println("What is the name of the new Faculty?");
				//String facultyName = keyboard.nextLine();
				
				//System.out.println("What is the employee id of the new Faculty?");
				//int employeeId = keyboard.nextInt();
				//keyboard.nextLine(); //go to the next line
				
				//System.out.println("What is the department of the new Faculty?");
				//String newDepartment = keyboard.nextLine();
				
				//currentFaculty = new Faculty(facultyName,employeeId,newDepartment);
				
				currentFaculty = new Faculty();
				enterName(currentFaculty);
				enterEmployeeId(currentFaculty);
				enterDepartment(currentFaculty);
			}
			else if(option == 4) {
				if(currentPerson != null) {
					System.out.println("Person's Name: " + currentPerson.getName());
				}
				
				if(currentEmployee != null) {
					System.out.println("Employee's Name: " + currentEmployee.getName());
					System.out.println("Employee's Id: " + currentEmployee.getEmployeeId());
				}
				
				if(currentFaculty != null) {
					System.out.println("Faculty'S Name: " + currentFaculty.getName());
					System.out.println("Faculty's Id: " + currentFaculty.getEmployeeId());
					System.out.println("Faculty's Department: "+ currentFaculty.getDepartment());
				}
			}
			else if(option == 5) {
				System.out.println("Thank you for using the program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 5);
	}
	
	public static void enterName(Person p) {
		Scanner keyboard = new Scanner(System.in);
		if(p != null) {
			System.out.println("What is the name?");
			String name = keyboard.nextLine();
			p.setName(name);
		}
	}
	
	//set employee id of the object that e refers to what the user types in as the employee id
	//make sure that e is not null before calling the setEmployeeId method on that object
	public static void enterEmployeeId(Employee e) {
		Scanner keyboard = new Scanner(System.in);
		if(e != null) {
			System.out.println("What is the employee ID?");
			int employeeId = keyboard.nextInt();
			e.setEmployeeId(employeeId);
		}
		
	}
	
	//set department of the object that f refers to what the user types in as the department
	//make sure that f is not null before calling the setDepartment method on that object
	public static void enterDepartment(Faculty f) {
		Scanner keyboard = new Scanner(System.in);
		if(f != null) {
			System.out.println("What is the department?");
			String department = keyboard.nextLine();
			f.setDepartment(department);
		}
		
	}

}




