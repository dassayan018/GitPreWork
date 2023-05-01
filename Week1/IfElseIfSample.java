import java.util.Scanner;
public class IfElseIfSample
{
	public static void main(String args[])
	{
		int score;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enteryour score");
		score = scan1.nextInt();
		if(score>=0 && score<=100)
		{
			if((score>=50) && (score<=60))
			{
				System.out.println("Good Passed..........!");
			}
			else if((score>60) && (score<=70))
			{
				System.out.println("Very Good, Secured First Class.........!!!!");
			}
			else if((score>70) && (score<=100))
			{
				System.out.println("Excellent, secured Distinction.....!!!");
			}
			else
			{
				System.out.println("Sorry!!!! Try again..");
			}
		}
		else
		{
			System.out.println("Sorry, score not in valid range...!!!");
		}
		
	}
	
}