package week05;

public class Manager extends Employee {
	

	private double bonusPercentage;
	
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) {
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		return (getPay() / 80) + (getPay() * bonusPercentage);
	}
	
	

}
