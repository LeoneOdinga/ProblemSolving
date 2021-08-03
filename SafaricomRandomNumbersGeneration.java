
/***********************
 *  Author:  Leone.O   *
 *     
 *  for educational    *
 *      
 *   purposes only!    *
 *                     *
 *//********************/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.Scanner;

public class SafaricomRandomNumbersGeneration
{
	static Scanner input= new Scanner(System.in);
	static final String fileName="Safaricom Numbers.txt"; //use your own filepath name if you need
	
   public static void main (String[] args)
   {
	   intro();
	   
	   try
	   {
	   InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	   OutputStreamWriter outputStreamReader = new OutputStreamWriter(System.out);
	   BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	   BufferedWriter bufferedWriter = new BufferedWriter(outputStreamReader);
	   
	   createFile(); 
	   System.out.println(); 
	   
	   bufferedWriter.write("Enter The Number Of safaricom numbers you want to generate: ");
	   bufferedWriter.flush();
	   
	   String line = bufferedReader.readLine();
	   int userInput =Integer.parseInt(line);
	   FileWriter fileWriter = new FileWriter(fileName);
	   PrintWriter printWriter = new PrintWriter(fileWriter);
	   
	  System.out.printf("%n%s%38s%n","Number Count","Safaricom Numbers generated\n\n");
	   printWriter.printf("%n%s%38s%n","Number Count","Safaricom Numbers generated\n\n");
	  // Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/safaricomnumbers","root","");
	   for(int i=1;i<=userInput;i++)
	 {	   
		   if(i>userInput)
		   {
			   break;
		   }
		   else
		   {
			   if(i%5==0)
			   {
				   System.out.println(); 
				  printWriter.println();
			   }
			   
			   @SuppressWarnings("unused")
			String generatedCsvNumbers = String.valueOf(i)+","+String.valueOf(printSafaricomNumbers()+"\n");
			   String generatedTxtNumbers = String.valueOf(i)+"\t\t\t"+String.valueOf(printSafaricomNumbers()+"\n");
			   System.out.printf(generatedTxtNumbers);
			   
			// printWriter.printf(generatedCsvNumbers); // if you need to generate csv file use uncomment this
			   
			  printWriter.printf(generatedTxtNumbers);
		   }
   }
	      printWriter.close();
	   
	   }catch(Exception e)
		 {
		   System.out.print("Error during reading input/output");
			 e.printStackTrace();
		 }
   }
   /*
    *  function to select a random index from a given array of integers
    */
   
   public static int getRandom(int[] array)
   {
	
	   int random = new SecureRandom().nextInt(array.length);
	   
	   return array[random];
   }
   
 
   /*
    * function to print all generated safaricom numbers.
    */
   
   public static String printSafaricomNumbers()
   {
	   int T1,T2,T3,T4,T5,T6,T7,T8,T9,T10;
	   
	   T1=0;
	   T2=7;
	   int t3DigitsArray [] = {0,1,2,4,9};
	   T3= getRandom(t3DigitsArray);
	   
	   int otherDigitsArray[]= {0,1,2,3,4,5,6,7,8,9};
	   
	   T4=getRandom(otherDigitsArray);
	   T5=getRandom(otherDigitsArray);
	   T6= getRandom(otherDigitsArray);
	   T7= getRandom(otherDigitsArray);
	   T8= getRandom(otherDigitsArray);
	   T9=getRandom(otherDigitsArray);
	   T10= getRandom(otherDigitsArray);
	   
	   String safNumberGenerated=" "+T1+T2+T3+T4+T5+T6+T7+T8+T9+T10;
	   
	   return safNumberGenerated;
	   
   }
   
   /*
    * creating a txt file to store all the generated numbers each time the program runs
    * kindly take note of the running time  for given "n" inputs!! 
    * made the file since the console does not capture more than 5000 numbers
    */
   
   public static void createFile()
   {
	   try
	   {
		   File fileNameObject = new File(fileName);	
		   if(fileNameObject.createNewFile())
		   {
			   System.out.print("File Created: "+fileNameObject.getName());
		   }
		   else
		   {
			   System.out.print("The File "+fileNameObject.getName()+" already exists in system directory! Please proceed...\n");
		   }
	   }catch(Exception e)
	   {
		   System.out.print("An error occured!");
		   e.printStackTrace();
	   }
	   
	  
   }
   public static void intro()
   {
	   System.out.println("Welcome To Safaricom Random Number Generation Console Application: ");
	   System.out.println("You Will Be Able To Generate Any Number Of Safaricom Numbers You Would Wish When told to do so ");
	   System.out.println("We Will Also Store The generated random numbers for you in files ( txt and csv extensions )");
	   System.out.println("txt extension works well. For csv you will have to use the commented code and change the filename to dot csv plus extend the columns\n\n");
   }
 
}
