public class CompoundInterest 
{
	public static void main(String[] args) 
	{
		int amount;
		int principal = 1000;
		double rate = 0.05;
		int dollars, cents;
		
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; year++)
		{
			amount = (int)(principal * 100 * Math.pow(1 + rate, year));
			
			dollars = amount / 100;
			cents = amount % 100;		
			System.out.printf("%4d%17d%s%d%n", year, dollars, ".", cents);
		}
					
	}
}
