import java.util.Scanner;

/*This program displays the amount of days in the selected month */

public class DaysInAMonth {

	public static void main(String[] args) 
	{
		//Read User Input
		Scanner in = new Scanner(System.in);
		
		//Display Prompt 
		System.out.println("Select the Month to find out How Many Days it has:"); 
        	System.out.println("1. January"); 
        	System.out.println("2. February"); 
        	System.out.println("3. March");
        	System.out.println("4. April");
        	System.out.println("5. May");
        	System.out.println("6. June");
        	System.out.println("7. July");
        	System.out.println("8. August");
        	System.out.println("9. September");
        	System.out.println("10. October");
        	System.out.println("11. November");
        	System.out.println("12. December");
        	System.out.println("");
        	System.out.print("Selection: ");
 
        	//Input Value
        	int monthNumber;
        
        	//Switch that prints user requested information
        	monthNumber = in.nextInt();
        	switch (monthNumber) 
        	{
        	case 1:
        	  System.out.println("");
                  System.out.println("31");
              
                  break;
        	
        	case 2:
        	  System.out.println("");
              	  System.out.println("28");
              
              	  break;
        
        	case 3:
        	  System.out.println("");
        	  System.out.println("31");
        	  
                  break;
                  
        	case 4:
        	  System.out.println("");
                  System.out.println("30");
              
                  break;
        	
        	case 5:
        	  System.out.println("");
                  System.out.println("31");
              
                  break;
        	
        	case 6:
        	  System.out.println("");  
        	  System.out.println("30");
        	  
                  break;
        
        	case 7:
        	  System.out.println("");
        	  System.out.println("31");
        	  
                  break;
        
        	case 8:
        	  System.out.println("");
              	  System.out.println("31");
              
              	  break;
        
        	case 9:
        	  System.out.println("");
        	  System.out.println("30");
        	  
                  break;
        
        	case 10:
        	  System.out.println(""); 
        	  System.out.println("31");
        	  
                  break;
        
        	case 11:
        	  System.out.println("");
                  System.out.println("30");
              
                  break;
        
        	case 12:
        	  System.out.println("");
                  System.out.println("31");
              
                  break;
        
        	default:
              	
              	System.out.println("Invalid month.");
              
           	  break;
        }
        
     }
}
       
