
public class Employee extends Person { //extends creates the inheritance relationship between Employee and Person
	//instance variables
	private int employeeId;
	
	//default constructor
	public Employee() {
		super(); //call to the default constructor of the parent class (Person)
		employeeId = 0;
	}
	
	//overloading constructors
	public Employee(String newName) {
		super(newName); //calls the second constructor of the parent class (Person)
		employeeId = 0;
	}
	
	public Employee(String newName, int newEmployeeId) {
		//super()
		//super.setName(newName);
		super(newName);
		setEmployeeId(newEmployeeId);
		//if(newEmployeeId > 0) {
		//	employeeId = newEmployeeId;
		//}
	}
	
	public Employee(int newEmployeeId) {
		super();
		setEmployeeId(newEmployeeId);
	}
	
	//non-static methods
	public void setEmployeeId(int newEmployeeId) {
		if(newEmployeeId > 0) {
			employeeId = newEmployeeId;
		}
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	//override the toString method from the Person class so that it returns the name and the employee id 
	public String toString() {
		return super.toString() +  " Employee Id: " + employeeId; 
		//return "Name: " + getName() + " Employee Id: " + employeeId;
		//return "Name: " + super.getName() + " Employee Id: " + employeeId;
		//return "Name: " + this.getName() + " Employee Id: " + employeeId;
	}
	//override the equals method in the Employee class to check if the name and the employee id are the same
		//and if they are return true otherwise return false
		public boolean equals(Object otherObject) {
			boolean areTheyEqual = false;
			if(otherObject != null && otherObject instanceof Employee) {
				Employee otherEmployee = (Employee)otherObject;
				if(this.getName().equals(otherEmployee.getName()) && //super.equals(otherObject) &&
						this.employeeId == otherEmployee.employeeId) {
					areTheyEqual = true;
				}
			}
			return areTheyEqual;
		}       
	

		
}
	

