import java.util.Scanner;
import javax.swing.*;

public class CheckPalindrome {

  
	public static void main(String[] args) {
	
		// Create a Scanner
		 Scanner input = new Scanner(System.in);
		
		 // Prompt the user to enter a string
		 System.out.print("Enter a string: ");
		 String inputString = input.nextLine();
		
		 if(isPalindrome(inputString)){
			
			 //console prompt 
			 System.out.println(inputString + " is a palindrome");
			 //window prompt
			 JOptionPane.showMessageDialog(null, inputString+" is a palidrome");	 
		 }//END OF if
		 
		 else{
			 
			//console prompt 
			 System.out.println(inputString + " is not a palindrome");
			 //window prompt
			 JOptionPane.showMessageDialog(null, inputString+" is not a palidrome");
			 
		 }//END OF else
			 
		
	}//END OF main

	/** Check if a string is a palindrome */
	private static boolean isPalindrome(String inputString) {
		
		// The index of the first character in the string
		int low = 0;
		// The index of the last character in the string
		int high = inputString.length()- 1;
		
		while(low < high){
			
			if(inputString.charAt(low) != inputString.charAt(high))
				return false;
			
			low++;
			high--;
					
		}//END OF while
		
		return true;
		
	}//END OF isPalindrome

}//END OF CheckPalindrome
