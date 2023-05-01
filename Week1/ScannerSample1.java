import java.util.Scanner;
public class ScannerSample1{
	public static void main(String args[]){
		String empName="";
		String department="";
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter your name");
		empName = scan1.nextLine();
		System.out.println("Enter your department");
		department = scan1.next();
		System.out.println("The employee name is "+empName);
		System.out.println("The department on which he works is "+department);
	}
}