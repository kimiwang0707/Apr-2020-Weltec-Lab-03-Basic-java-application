import java.util.Scanner;
public class StudentGrades
{
	public static void main(String[] args)
	{		
		int counta = 0; 
		int countb = 0;
		int countc = 0;
		int countd = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int count = 0; count < 5; count++)
		{
			System.out.print("Enter Student's Name: ");
			String name = input.next();
			System.out.print("Enter Student Letter Grade: ");
			String grade = input.next();
			System.out.println("=============================================");
		
			switch (grade)
			{
				case "A": counta++ ; break;
				case "B": countb++ ; break;
				case "C": countc++ ; break;
				case "D": countd++ ; break;		
			}
		}	
		
		System.out.printf("The number of students got (A): %d%nThe number of students got (B): %d%nThe " +
			"number of students got (C): %d%nThe number of students got (D): %d%n", counta, countb, countc, countd);			      
     }
		
}
		
	
	
	

