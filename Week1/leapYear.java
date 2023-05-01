// write a programe to check whether a year is leap year or not

public class leapYear{
	public static void main(String args[]){
		int year = 1900;
		if (year % 400==0)
			System.out.println("Year "+year+ " is a leap year.");
		else if (year % 100==0)
			System.out.println("Year "+year+ " is not a leap year.");
		else if (year % 4==0)
			System.out.println("Year "+year+ " is a leap year.");
		else
			System.out.println("Year "+year+ " is not a Leap Year");
	}
}