
public class Person extends Object {
	//instance variables
	private String name;
	
	//default constructor
	public Person() {
		super(); //calls the default constructor of the parent class (Object)
		name = "";
	}
	
	//overloading constructors
	public Person(String newName) {
		super(); //calls the default constructor of the parent class (Object)
		name = newName;
	}
	
	//non-static methods
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	//override the toString method from the Object class which means to replace the method that you are inheriting
	//with a different implementation, but that method must have the same method heading/signature as the method
	//that is being inherited from the parent class
	public String toString() {
		return "Name: " + name;
	}
	//override the equals method so that it checks whether the value of the name instance variable
		//is the same for both objects
		public boolean equals(Object otherObject) {
			boolean areTheyEqual = false;
			if(otherObject != null && otherObject instanceof Person) {
				Person otherPerson = (Person)otherObject; //object type casting
				if(this.name.equals(otherPerson.name)) {
					areTheyEqual = true;
				}
			}
			return areTheyEqual;
		}
	}


