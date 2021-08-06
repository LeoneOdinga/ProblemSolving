package classLabs;
import java.util.Scanner;

public class Ironical 
{
	static Scanner input = new Scanner(System.in);
	
   	public static void main(String[] args)
   	{
   	   System.out.println("Enter the value of X: ");
   	   double userInput = input.nextInt();
   	   
   	   System.out.println("The values in the collatz sequence are: ");
   	   computeProblem(userInput);
   	}
   	
   	public static boolean isEven(double x)
   	{
   		if(x%2==0)
   		{
   			return true;
   		}
   		else
   		{
   			return false;
   		}
   	}
   	
   	public static void computeProblem(double x)
   	{
   		double y=x;
   		double counter=1;
   		
   		while(x!=1)
   		{
   			System.out.print(x+" , ");
   			
   			if(isEven(x))
   			{
   				x/=2;
   			}
   			else
   			{
   				x=3*x+1;
   			}
   			counter++;
   		}
   		System.out.print(x); System.out.println();
   		System.out.println("Number of times: "+counter);
   		System.out.println("Occurence Percentage: "+(counter/y*100)+" %");
   		
   	}
}