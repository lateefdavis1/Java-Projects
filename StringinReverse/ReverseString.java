import java.util.*;
 
/*A Program that reads a word and prints the word in Reverse.*/ 

public class ReverseString {

	public static void main(String[] args) 
	{
	    //Variable Declaration for User Input
	    String original;
		
		//Placeholder for String Reversal
	    String reverse = "";
	    
	    //Read User Input
	    Scanner in = new Scanner(System.in);
	    
	    //Display Prompt
	    System.out.println("Enter a String to Reverse: ");
	    
	    //Returns Input 
	    original = in.nextLine();
	    
	    //Reads the Integer length of the String input from the user
	    int length = original.length();
	    
	    //Loop for initializing, with a conditional statement for placement, and a update
	    //statement for iteration
	    for ( int i = length - 1 ; i >= 0 ; i-- )
	    {
	    	//Traverses all Valid positions in the String 
	    	reverse = reverse + original.charAt(i);
	    }
	     
	    //Output Display
	    System.out.println("The Entered String in Reverse is: " + reverse);
	    
	   }
	}
