public class EvenOddChecker{
	public static void main(String args[]){
		int num = 25;
		String numType;

		numType = (num%2==0)?"even":"odd";
		System.out.println("Number is "+numType);
	}
}