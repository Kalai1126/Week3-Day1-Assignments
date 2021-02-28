package week3.Day1;

public class BankInfo {
	
	
	public int saving(int saving) {
		System.out.println("The saving amount in Bank is:"+saving);
		System.out.println("\r\n");
		return saving;
	}

	public int fixed(int fixamt) {
	System.out.println("The fixed amount  in Bank is:"+fixamt);
	System.out.println("\r\n");
	return fixamt;
	}
	
	public int deposit(int depamt) {
		System.out.println("I am from superclass called from subclass");
		System.out.println("The deposit amount in Bank is:"+depamt);
		System.out.println("\r\n");
		return depamt;
		
	}
}
