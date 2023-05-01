public class Conversion{
	public static void main(String args[]) {
	byte b;
	int i = 257;
	double d = 323.142;
	System.out.println("\nConversion of int to byte");
	b = (byte) i; //Explicit casting
	System.out.println("i and b" + i + " " + b);
	System.out.println("\nConversion of double to int.");
	i = (int) d;
	System.out.println("d and i" + d +" " + i);
	System.out.println("\nConversion of double to byte.");
	b = (byte) d;
	System.out.println("d and b" + d +" " + b);



	char symbol = 'A'; // 2 bytes
	int mySymbol = symbol; //4 bytes - Wide Casting Implicit conversion
	System.out.println("My symbol is " + mySymbol);

	mySymbol = 66;
	char myNewSymbol = (char) mySymbol; // Explicit casting - Narrow
	System.out.println("My New Symbol" + myNewSymbol);


	// short sVar = 10000;
	byte bVar = 125; // small sized type
	short sVar; // bigger sized type
	sVar = bVar; // conversion - wide cast - implicit
	System.out.println("The Byte in short is " + sVar);

	short sVar1 = 300;
	byte bVar1 = (byte)sVar1; // 300-256
	System.out.println("The short value in byte is "+ bVar1);
	}
	
}