import java.util.*;
/**
    This program prints a table showing the growth of an investment.
  */
  public class InvestmentInterest
  {
     public static void main(String[] args)
      {  
        final double RATE = 5;
        final double INITIAL_BALANCE = 1000;
        double balance = INITIAL_BALANCE;

       //Prompts user to enter the number of years for calculations
       System.out.print ("Enter number of years: ");
        Scanner in = new Scanner (System.in);
       int nyears = in.nextInt();
       
       // Print the table of balances for each year
  
       for ( int year = 1;  year <= nyears;  year++ )
        {
          double interest = balance * RATE / 100;
          balance = balance + interest;
          System.out.printf ("%4d %10.2f\n", year, balance);
       }
    }
}
