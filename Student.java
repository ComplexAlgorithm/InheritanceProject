
public class Student extends Person {
	//instance variables
	//studentId should be a whole number and be private
	private int studentId;
	//default constructor
	public Student() {
		super();
		studentId = 0;
	}
	//overloaded constructor that takes name
	public Student(String newName) {
		super(newName);
		studentId = 0;
	}
	//overloaded constructor that takes name and studentId
	public Student(String newName, int newStudentId) {
		super(newName);
		setStudentId(newStudentId);
	}
	//overloaded constructor that takes studentId
	public Student(int newStudentId) {
		super();
		setStudentId(newStudentId);
	}
	
	//non-static methods
	//setStudentId (newStudentId > 0)
	public void setStudentId(int newStudentId) {
		if(studentId > 0) {
			studentId = newStudentId;
		}
	}
	//getStudentId
	public int getStudentId() {
		return studentId;
	}
	
	//override toString method to return name and studentId as a String
	public String toString() {
		return super.toString() + "Student ID: " + studentId;
	}
	
	//override the equals to make sure the name and the studentId are the same for both objects
	//if they are return true otherwise return false
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Student) {
			Student otherStudent = (Student)otherObject; 
			if(this.getName().equals(otherStudent.getName()) &&
					this.studentId == otherStudent.studentId) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual;
	}
	
}
	

