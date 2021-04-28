
public class Demo {
	public static void main(String[] args) {
		Person ann = new Person();
		ann.setName("Ann");
		System.out.println("Person's Name: " + ann.getName());
		
		Employee nancy = new Employee();
		nancy.setName("Nancy");
		nancy.setEmployeeId(1);
		System.out.println("Employee's Name: " + nancy.getName());
		System.out.println("Emplyoee's Id: " + nancy.getEmployeeId());
		
		//create an object of the Faculty class and refer to this object as francesca
		//change the name instance variable of this object to "Francesca"
		//change the employee id instance variable of this object 2
		//change the department instance variable of this object to "CSC"
		//print the name instance variable of this object
		//print the employee id instance variable of this object
		//print the department instance varaible of this object
		Faculty francesca = new Faculty();
		francesca.setName("Francesca");
		francesca.setEmployeeId(2);
		francesca.setDepartment("CSC");
		System.out.println("Name: " + francesca.getName());
		System.out.println("Employee ID: " + francesca.getEmployeeId());
		System.out.println("Department: " + francesca.getDepartment());       
		
		//nancy = ann; //nancy is unable to refer to an object that only has the Person type because nancy must refer to an object of the Employee class
				//francesca = ann; //francesca is unable to refer to an object that only has the Person type because francesca must refer to an object of the Faculty class
				//francesca = nancy;  //francesca is unable to refer to an object that has the Person and Employee type because francesca must refer to an object of the Faculty class
				
				ann = nancy; //ann can refer to the object that nancy refers to because it does have the Person type 
				ann.setName("Ann"); //ann can only call methods defined in the person class
				//ann.setEmployeeId(3); //ann reference can only call methods definted in the person class
				nancy.setName("Nancy"); //nancy can call methods defined in the Person class
				nancy.setEmployeeId(3); //and methods defined in the Employee class
				
				nancy = francesca; //can continue this example like the one above for practice
				//use the nancy and francesca references to change the instances variables of the same object
				//like we did with ann and nancy above
				nancy.setName("Nancy");
				nancy.setEmployeeId(4);
				francesca.setName("Francesca");
				francesca.setEmployeeId(4);

	}

}


