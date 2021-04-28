
public class Faculty extends Employee { //inherits from Employee
	//instance variables
	private String department;
	
	//default constructor
	public Faculty() {
		super();
		department = "";
	}
	
	public Faculty(String newName) {
		super(newName);
		department = "";
	}
	
	public Faculty(String newName, int newEmployeeId) {
		super(newName,newEmployeeId);
		department = "";
	}
	
	public Faculty(String name, int employeeId, String department) {
		super(name,employeeId);
		setDepartment(department);
	}
	
	public Faculty(String facultyName, String facultyDepartment) {
		super(facultyName);
		setDepartment(facultyDepartment);
	}
	
	public Faculty(int facultyId, String facultyDepartment) {
		super(facultyId);
		setDepartment(facultyDepartment);
	}
	
	public Faculty(int facultyId) {
		super(facultyId);
		department = "";
	}
	
	//public Faculty(String facultyDepartment) {
	//	super();
	//	setDepartment(facultyDepartment);
	//}
	
	
	//non-static methods
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	
	public String getDepartment() {
		return department;
	}
	
	//override the toString method from the Employee class so that it returns name, employeeid, and department
	public String toString() {
		return super.toString() + " Department: " + department;
		//return "Name: " + this.getName() + "\n" + "Employee ID: " + super.getEmployeeId() + "\n" + "Department: " + department;
		
	}
	//override the equals method of the Faculty class to compare name, employeeid, and department
		//return true if all three are the same otherwise return false
		public boolean equals(Object otherObject) {
			boolean areTheyEqual = false;
			if(otherObject != null && otherObject instanceof Faculty) {
				Faculty otherFaculty = (Faculty)otherObject;
				if(this.getName().equals(otherFaculty.getName()) && 
						this.getEmployeeId() == otherFaculty.getEmployeeId() && //super.equals(otherObject) &&
						this.department.equals(otherFaculty.department)) {
					areTheyEqual = true;
				}
			}
			return areTheyEqual;
		}
	}


