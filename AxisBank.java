package week3.Day1;

public class AxisBank extends BankInfo{
	
	public int deposit(int depAxamt) {
		System.out.println("I am from subclass, overriding the super class method:");
		System.out.println("The deposit amount in Axis Banks is:"+depAxamt);
		System.out.println("\r\n");
		System.out.println("I want to call deposit amount of sub class:");
		super.deposit(2000);
		return depAxamt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank Ax = new AxisBank();
		Ax.deposit(1000);
		Ax.fixed(50000);
		Ax.saving(60000);		
	}

}
