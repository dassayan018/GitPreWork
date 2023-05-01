import java.util.Scanner;

public class ScannerSample{
	public static void main(String args[]){
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a double value");
		double gstTax = scan1.nextDouble();
		System.out.println("Enter a long value");
		long salary = scan1.nextLong();
		System.out.println("Enter a float value");
		float tax = scan1.nextFloat();
		System.out.println("Enter a boolean value");
		boolean isEligible = scan1.nextBoolean();
		System.out.println("Enter a integer value");
		int score = scan1.nextInt();

		System.out.println("The double value is "+gstTax);
		System.out.println("The long value is "+salary);
		System.out.println("The float value is "+tax);
		System.out.println("The boolean value is "+isEligible);
		System.out.println("The integer value is "+score);

	}
}

