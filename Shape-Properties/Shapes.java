import java.util.*;

// Displays a menu to user and gets Shape calculations
// for rectangle and circle.
// Lateef Davis
// Version: Beta 

public class Shapes
{
   public static void main(String[] args)
   {     
      int menuItem = 0;
      
      while (menuItem != 4)
      {
         menuItem = displayMainMenu();      
                  
         if (menuItem == 1)
         {  
            //Sub Menu for User to Choose between the Area or Parameter of Rectangle
            int subChoice = displayRectangleMenu();
            
            if (subChoice == 1)
            {
            displayRectangleArea();
            }
            else
            {
            displayRectanglePerimeter();
            }
         }
         else if (menuItem == 2)
         {
            displayCircleArea();
         }
         else if (menuItem == 3)
         {
            displayTriangleArea();
         }
         else if (menuItem == 4)
         {
            displayExitMessage();
         }
         else
         {
            System.out.println("Goodbye! Thanks for using the Shapes application.");
         }

         System.out.println();
      }
   }
   
   // Displays menu choices to user
   // @return  The menu choice
   public static int displayMainMenu()
   {
      Scanner keyboardInput = new Scanner(System.in);
      int menuOption = 0;
      
      while (menuOption < 1 || menuOption > 4)
      { 
         System.out.println("Please select from the following menu:"); 
         System.out.println("1. Rectangle Properties"); 
         System.out.println("2. Circle Properties"); 
         System.out.println("3. Triange Properties");
         System.out.println("4. Exit");
         System.out.print("Selection: ");
         menuOption = keyboardInput.nextInt(); 
         System.out.println();

         if (menuOption < 1 || menuOption > 4)  // If user enters invalid number, gets message
         { 
            System.out.println("Invalid Menu Selection!"); 
            System.out.println("Please make another selection."); 
            System.out.println();
         }
      }
      return menuOption;      // Return the menu choice to the main method

   }

   // Calculates the area of the Rectangle
   public static double getRectangleArea(double length, double width) 
   {
      return length * width;
   }

   // Calculates the area of the Circle
   public static double getCircleArea(double radius)
   {
      return Math.PI * radius * radius;
   }
   // Calculates the area of the Triangle
   public static double getTriangleArea(double base, double height)
   {
      return base * height/.5;
   }
   // Calculates the Parameter of the Rectangle
   public static double getRectanglePerimeter(double length, double width)
   {
      return 2 * length + 2 * width;
   }
   //Methods to Display Output to User
   //Display the RectangleArea
   public static void displayRectangleArea()
   {
      Scanner keyboardInput = new Scanner(System.in);
      System.out.print("Input the length of the rectangle: "); 
      double length = keyboardInput.nextDouble(); 
      
      System.out.print("Input the width of the rectangle: ");
      double width = keyboardInput.nextDouble();
      
      System.out.println("The area of the rectangle is " + getRectangleArea(length, width));
   }
   //Display the Circle Area
   public static void displayCircleArea()
   {
      Scanner keyboardInput = new Scanner(System.in);
      System.out.print("Input the radius of the circle: ");
      
      double radius = keyboardInput.nextDouble();
      System.out.println("The area of the circle is " + getCircleArea(radius));
   }
   //Display the Triangle Area
   public static void displayTriangleArea()
   {
      Scanner keyboardInput = new Scanner(System.in);
      System.out.print("Input the base of the triangle: "); 
      
      double base = keyboardInput.nextDouble(); 
      System.out.print("Input the height of the triangle: ");
      
      double height = keyboardInput.nextDouble();
      System.out.println("The area of the triangle is " + getTriangleArea(base, height));
   }
   //Display the Exit Message
   public static void displayExitMessage()
   {
      System.out.println("Goodbye! Thanks for using the Shapes application.");
   }
   //Display the Rectangle Parameter
   public static void displayRectanglePerimeter()
   {
      Scanner keyboardInput = new Scanner(System.in);
      System.out.print("Input the length of the rectangle: "); 
      double length = keyboardInput.nextDouble(); 
      
      System.out.print("Input the width of the rectangle: ");
      double width = keyboardInput.nextDouble();
      
      System.out.println("The perimeter of the rectangle is " + getRectanglePerimeter(length, width));
   }
   //Display the Rectangle Menu
   public static int displayRectangleMenu()
   {
      Scanner keyboardInput = new Scanner(System.in);
      int choice = 0;
      System.out.println("1. Find Rectangle Area");
      System.out.println("2. Find Rectangle Perimeter");
      choice = keyboardInput.nextInt();
      return choice;
   }
}
