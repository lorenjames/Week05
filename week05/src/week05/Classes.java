package week05;

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder name = new StringBuilder(); //StringBuilder is the class, the new keyword makes an instance of the object
		StringBuilder name2 = new StringBuilder(); //second instance of same class StringBuilder
		
		/*
		 * Student student1 = new Student(); student1.firstName = "Tom";
		 * student1.lastName = "Smith"; student1.gradeLevel = 12; student1.phoneNumber =
		 * "312-519-3947";
		 */
		
		//student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle","312-123-4567",11);
		student3.introduce();
		

	}

}
