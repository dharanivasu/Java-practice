/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.*;
class Power {
  public static void main(String args[]) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter num1");
    int num1=Sc.nextInt();
    System.out.println("enter num2");
    int num2=Sc.nextInt();
    //int base = 3, exponent = 2;
    double result = Math.pow(num1, num2);

    System.out.println("Answer = " + result);
  }
}