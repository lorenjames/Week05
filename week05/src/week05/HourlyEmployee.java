package week05;

public class HourlyEmployee extends Employee {
	

	private double hoursWorked;
	
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
		super(firstName, lastName, pay);
		this.hoursWorked = hoursWorked;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		return getPay() * hoursWorked;
	}
	
	

}
