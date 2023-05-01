public class ProfitLoss{
	public static void main(String args[]){
		int costprice = 400;
		int sellprice = 450;
		int profit,loss;
		if (sellprice>costprice)
		{
			profit = sellprice - costprice;
			System.out.println("Profit is " +profit);
		}
		else
		{
			loss = costprice-sellprice;
			System.out.println("Loss is " +loss);
		}
	}
}