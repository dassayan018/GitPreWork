class TableofTwo{
	public static void main(String args[]){
		int i=1;
		// infinite for loop
		for(;;i++){
			if(i%2!=0)
				continue;
			else if(i>20)
				break;
			else
				System.out.println(i);
		}
	}
}