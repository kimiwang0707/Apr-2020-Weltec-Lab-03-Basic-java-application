import java.util.Scanner;
public class GasMileage 
{
	public static void main(String[] args)
	{
		int miles, gallons;
		float miPerGal, avgMiPerGal;
		float milesAmount = 0;
		float galAmount = 0;
		
		Scanner input = new Scanner(System.in);	
	
		for(int count = 1; count > 0; count++)
		{
			System.out.print("Enter the miles driven: ");
			miles = input.nextInt();
			System.out.print("Enter the gallons used: ");
			gallons = input.nextInt();		    
			miPerGal = (float) miles / (float) gallons;
			
			milesAmount = milesAmount + miles;
			galAmount = galAmount + gallons;		
			avgMiPerGal = milesAmount / galAmount;
		
			System.out.printf("%nMiles per gallon for this trip: %.2f%n", miPerGal);
			System.out.printf("Combined miles per gallon for all trips: %.2f%n", avgMiPerGal);
			System.out.println("=============================================================");
					
		}			
		
	}
	
}
