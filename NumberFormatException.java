/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/

import java.util.*;

public class NumberFormatException {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first name: ");
    String fn = sc.nextLine();

    System.out.print("Enter last name: ");
    String ln = sc.nextLine();

    System.out.print("Enter mobile number: ");
    String mobileNum = sc.nextLine();
    System.out.println("Number of characters in first name: " + fn.length());
    System.out.println("Number of characters in last name: " + ln.length());

    try {
      long mobileNumLong = Long.parseLong(mobileNum);
      long sum = 0;
      while (mobileNumLong > 0) {
        sum += mobileNumLong % 10;
        mobileNumLong /= 10;
      }
      System.out.println("Sum of digits of mobile number: " + sum);
    } catch (Exception e) {
      System.out.println("Invalid mobile number");
    }
  }
}