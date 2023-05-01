// Write a Java program to check whether the character is an alphabet/ digit/special character

public class character{
	public static void main(String args[]){
		char ch = '@';
		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("This is a Alphabet");
		}
		else if (ch >='0' && ch<='9')
		{
			System.out.println("This is a Number");

		}
		else
		{
			System.out.println("This is a special character");
		}
	}
}