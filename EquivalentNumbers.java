/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   
*/

import java.util.Scanner;
public class EquivalentNumbers {
   
   public static void main(String[] args) {
      
      Convert obj = new Convert();
      obj.getVal();
      obj.convert();
   }
}
class Convert {
   
   int num;
   
   public void getVal() {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the Number = ");
      num = sc.nextInt();
   }
   public void convert() {
      String hexa = Integer.toHexString(num);
      System.out.println("HexaDecimal value is "+hexa);
      String octal = Integer.toOctalString(num);
      System.out.println("Octal value is = "+octal);
      String binary = Integer.toBinaryString(num);
      System.out.println("Binary value is = "+binary);
   }
}