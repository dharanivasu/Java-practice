/*1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers.

 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"*/

import java.util.Scanner;
class Arithemateoperation
{
  public static void main(String args[])
  {
 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value");
    int a=sc.nextInt();
    System.out.println("Enter b value");
    int b=sc.nextInt();
    
     int  c=a/b;
        System.out.println(c);
      
    System.out.println("Exception handled");
  }
}