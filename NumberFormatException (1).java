/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/

import java.util.*;

public class NumberFormatException {

  public static void main(String[] args) {
   
    test();
  }

  public static void test() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    String a = scanner.next();
    System.out.print("Enter the second number: ");
    String b = scanner.next();

    try {
      // Convert the input strings to integers
      int num1 = Integer.parseInt(a);
      int num2 = Integer.parseInt(b);

      
      System.out.println("Sum: " + (num1 + num2));
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}