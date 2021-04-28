
public class Demo3 {
	public static void main(String[] args) {
		Object myObject = new Object();
		System.out.println(myObject.toString());
		
		Object myObject2 = new Object();
		//myObject = myObject2;
		//myObject2 = myObject;
		if(myObject.equals(myObject2)) {
			System.out.println("myObject is equal to myObject2");
		}
		else {
			System.out.println("myObject is not equal to myObject2");
		}
		
		Person robin = new Person("Robin");
		System.out.println(robin.toString());
		
		Person robin2 = new Person("Robin");
		System.out.println(robin2.toString());
		
		if(robin.equals(robin2)) {
			System.out.println("They have the same name");
		}
		else {
			System.out.println("They don't have the same name");
		}
		
		Employee alfred = new Employee("Alfred", 1);
		System.out.println(alfred.toString());
		
		Employee alfred2 = new Employee("Alfred",2);
		if(alfred.equals(alfred2)) {
			System.out.println("They are the same employee");
		}
		else {
			System.out.println("They are not the same employee");
		}
		
		Faculty batman = new Faculty("Batman",2,"Martial Arts");
		System.out.println(batman.toString());
		
		int x = 7;
		int y = 8;
		if(x == y) {
			System.out.println("X is equal to Y");
		}
		else {
			System.out.println("X is not equal to Y");
		}
	}

}
