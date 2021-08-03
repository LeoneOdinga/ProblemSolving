
package password;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Random;

import javax.swing.JOptionPane;
	
   public class PasswordRandom 
   {
		/**
		 * Creates a random password from ASCII letters Given password length bounds
		 */
		static  String generatePassword(int min_length, int max_length) 
		  {
		    Random random = new Random();

		    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    String lower = "abcdefghijklmnopqrstuvwxyz";
		    String numbers = "0123456789";
		    String specialChars = "!@#$%^&*(){}?><.+][`-_|~,";

		    String allChars = upper + lower + numbers + specialChars;

		    List<Character> letters = new ArrayList<Character>();
		    for (char c : allChars.toCharArray()) letters.add(c);

		    // Inbuilt method to randomly shuffle a elements of a list
		    Collections.shuffle(letters);
		    StringBuilder password = new StringBuilder();

		    // Note that size of the password is also random
		    for (int i = random.nextInt(max_length - min_length) + min_length; i > 0; --i) 
		    {
		      password.append(letters.get(random.nextInt(letters.size())));
		    }

		    return password.toString();
		  }
		  
		  public static void main(String[] args)
		  {
			  JOptionPane.showMessageDialog(null, "Welcome To The Password Making Game "+"\n"+"Make Sure To Select Strong Passwords! "+"\n"+"the maximum length is set to 40 "+"\n"+"Failure to observing game rules lead to termination of program however");
			  String minimumNumber,maximumNumber;
			  int min,max;
			  minimumNumber = JOptionPane.showInputDialog("Enter Minimum Password Length");
			  maximumNumber = JOptionPane.showInputDialog("Enter Maximum Password Length");
			  
			   min = Integer.parseInt(minimumNumber);
			   max = Integer.parseInt(maximumNumber);
			   
			   if(min>=0 && min<50 && max <100)
			   {
				   try
				   {
				   if(min<max)
				   {
					   JOptionPane.showMessageDialog(null, "Your password combination for "+min+" to "+max+" range is ready!"+"\n"+"Press OK to proceed!");
					   JOptionPane.showMessageDialog(null, "Your Password is: "+generatePassword(min,max));
				   }
				   else if(min>max)
				   {
					   JOptionPane.showMessageDialog(null, "Your password combination for "+min+" to "+max+" range is ready!"+"\n"+"Press OK to proceed!");
					   JOptionPane.showMessageDialog(null, "Your Password is: "+generatePassword(max,min));
				   }
				  
			  JOptionPane.showMessageDialog(null, "Thank You!! ");
			  int option= JOptionPane.showConfirmDialog(null, "Do you want to get another set of password?");
			  if(option==JOptionPane.YES_OPTION)
			  {
				  main(args);
			  }
			       
				   }catch(Exception e)
				   {
					   e.getMessage();
				   }
			   }
			   else
			   {
				   JOptionPane.showMessageDialog(null, "Your Inputs Were Noisy And The Program Exits... ");
				   System.exit(0);
				   
			   }
		  }
		}

