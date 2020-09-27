import java.util.Scanner;
public class CreditLimitCalculator 
{
	public static void main(String[] args) 
	{
		int acctNo, beginBalance, charges, credits, newBalance, count;
		Scanner input = new Scanner(System.in);
		
		for(count = 1; count > 0; count++)
		{
			System.out.print("Please enter account number: ");
			acctNo = input.nextInt();
			System.out.print("Balance at the begining of this month: $");
			beginBalance = input.nextInt();
			System.out.print("All charges of customer this month: $");
			charges = input.nextInt();
			System.out.print("All credits applied to the account this month: $");
			credits = input.nextInt();

			newBalance = beginBalance + charges - credits;
			if (newBalance < 0)
			{
				System.out.print("\nCredit limit exceeded\n");
			}else
			{
				System.out.printf("%nThe new balance is: $%d%n", newBalance);
			}
			System.out.print("========================================================\n");
		}
	
	}

}
