package week05;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Access Modifiers
		 * public - accessible everywhere
		 * private - only accessible from within the class itself
		 * protected - accessible within the class, other classes in the same package and all sub-classes
		 * No Modifier - same as protected, not accessible by subclasses in a different package
		 * */
		
		Student student = new Student();
		
		student.setFirstName("Sally");
		student.setPhoneNumber("123-456-7890");
		
		student.introduce();
		
		Rectangle rec = new Rectangle(10.0,15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
		
		

	}

}
