package week05;

//does not need main point because not access point to program

public class Student {
	
	static int numberOfStudents;
	// hide data and provide public method to write data
	private String firstName; //just blueprint so we don't need to assign value
	private String lastName;
	private String phoneNumber;
	int gradeLevel;
	
	/*
	 * Constructors
	 * */
	
	public Student() {};
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		//firstName = firstName; //assigns the value of the param back to itself
		this.firstName = firstName; //this keyword represents the instance of the class that is using it at the time
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;
		this.phoneNumber = phoneNumber;
	}
	
	/*
	 * Public Methods
	 * */
	
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is: " + phoneNumber);
	}
	
	/*
	 * Private Methods
	 */
	
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	/*
	 * Getters Setters
	 * */
	
	public void setFirstName(String firstName) {
		if(checkLength(firstName, 1)) {
			this.firstName = firstName;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		if(checkLength(lastName, 1)) {
			this.lastName = lastName;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(checkLength(phoneNumber, 9)) {
			this.phoneNumber = phoneNumber;
		}
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		if(gradeLevel > 0 && gradeLevel < 13) {
			this.gradeLevel = gradeLevel;
		}
	}
	
	public int getGradelevel() {
		return gradeLevel;
	}
	
	

}
