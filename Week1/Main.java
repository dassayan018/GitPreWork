class Main{
	public static void main (String args[]){
		int no = 5;
		// loop to keep count of number of rows
		for(int i=0; i<=5; i++){
			// inner loop to keep control of *
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			// Change to new line once inner loop is finished
			System.out.println();
		}
	}
}