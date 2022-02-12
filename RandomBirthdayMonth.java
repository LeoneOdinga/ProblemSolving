import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class RandomBirthdayMonth 
{
	static Scanner input=new Scanner(System.in);
    public static void main(String[] args)
    {
    	do
    	{
    	final int numberOfMonths=12;
    	
    	 Random random=new SecureRandom();	
    	int randomMonthNumber=1+random.nextInt(numberOfMonths);
    	
    	System.out.print("\nEnter your birthday month: ");
    	String myBirthdayMonth=input.nextLine();
    	myBirthdayMonth=myBirthdayMonth.toUpperCase();

    	String calender[]= {" ","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    	
    	for(int j=0;j<numberOfMonths;j++)
    	{
    	if(myBirthdayMonth.equals(calender[j]))
    	  {
    		
        	int selectedRandomMonthNumber=randomMonthNumber;
        	System.out.print("\n\nThe random month chosen is in month number:  " +integerToRoman(selectedRandomMonthNumber)+"\nAnd the Month Name is:"+calender[selectedRandomMonthNumber]+"\n"+calender[selectedRandomMonthNumber]+" Has "+CountCharacters(calender[selectedRandomMonthNumber])+" letters\n"+MyBirthday((myBirthdayMonth),calender[selectedRandomMonthNumber]));
        	System.out.println();
        	
    	  }
    	}
    	}while(true);
    }  
    
    
    /*
     *  Function to Convert Integers into Roman Numerals
     */   
    
    private static int[] allArabianRomanNumbers =new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] allRomanNumbers =new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
      
      private static String integerToRoman(int num) 
      {
        if (num <= 0) 
        {
          return "";
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < allArabianRomanNumbers.length; i++) 
        {
          int times = num / allArabianRomanNumbers[i];
          for (int j = 0; j < times; j++) 
          {
            builder.append(allRomanNumbers[i]);
          }

          num -= times * allArabianRomanNumbers[i];
        }

        return builder.toString();
      }
      /**
       * Count non-space character in string
       */
      private static int CountCharacters(String str) 
      {
        return str.replaceAll("\\s", "").length();
      }
      
      /*
       * check if it is your birthday
       */
     private static String MyBirthday (String myBirthdayMonth,String randomMonthGenerated)
      {
    	 boolean isMyBirthdayMonth = false;
          String birthdayStatus=null;
          if(randomMonthGenerated.equals(myBirthdayMonth))
          {
        	  isMyBirthdayMonth=true;
          }
          else
          {
        	  isMyBirthdayMonth=false;
          }
          if(isMyBirthdayMonth)
          {
        	  birthdayStatus="Is it your Birthday?: YES";
          }
          else
          {
          birthdayStatus="Is it your Bithday?: NO";
          }
          return birthdayStatus;
      }
      
    }
