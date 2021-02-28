package week3.Day1;

public class Calculator {
	
	public void add(int a, int b) {
		int sumOf2Digits=a+b;;
		System.out.println("Sum of 2 digits: "+sumOf2Digits);
	}
	public void add(int a, int b, int c) {
		int sumOf3Digits=a+b+c;
		System.out.println("Sum of 3 digits: "+sumOf3Digits);

	}
	
	public void multiply(int x, int y) {
		int intmul = x*y;
		System.out.println("Product of 2 digits int and int: "+intmul);
	}
	
	public void multiply(int x, double y) {
		double intdoublemul = x*y;
		System.out.println("Product of 2 digits int and double: "+intdoublemul);
	}

	public void subtract(int x, int y) {
		int intsub = x-y;
		System.out.println("The subtraction of 2 integers: "+intsub);
	}

	public void subtract(double x, double y) {
		double doublesum = x-y;
		System.out.println("The subtraction of 2 double: "+doublesum);
	}
	
	public void divide(int x, int y) {
		int divint = x/y;
		System.out.println("The division of 2 integers are: "+divint);
	}
	
	public void divide(int x, double y) {
		double divintdoub = x/y;
		System.out.println("The division of int and double are: "+divintdoub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator Cal = new Calculator();
		Cal.add(20, 10);
		Cal.add(20,10,30);
		Cal.multiply(20, 10);
		Cal.multiply(20, 50.345);
		Cal.divide(10, 5);
		Cal.divide(10, 5.3);
	}

}
