import java.util.Scanner;
public class SalesCommissionCalculator
{
	public static void main(String[] args) 
	{
		int qty1, qty2, qty3, qty4, count;
		double commision, earning;
		
		Scanner input = new Scanner(System.in);
		
		for (count = 1; count > 0; count++)
		{
			System.out.print("Enter the quantity sold of Item1: ");
			qty1 = input.nextInt();
			System.out.print("Enter the quantity sold of Item2: ");
			qty2 = input.nextInt();
			System.out.print("Enter the quantity sold of Item3: ");
			qty3 = input.nextInt();
			System.out.print("Enter the quantity sold of Item4: ");
			qty4 = input.nextInt();
		
			commision = (239.99 * qty1 + 129.75 * qty2 + 99.95 * qty3 + 350.89 * qty4) * 0.09;
			earning = 200 + commision;
			
			System.out.printf("%nThe salesperson's earning is: %.2f%n", earning);
			System.out.println("=====================================================");
		}
	}

}
