package week05;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay); //super constructor from super class that we are inheriting from
		// TODO Auto-generated constructor stub
	}

	@Override //tells you that this method is coming from the super class Employee
	public double calculatePay() {
		return this.getPay() / 80;
	}
	


}
