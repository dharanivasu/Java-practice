/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers
   using next() method of scanner class. Convert into numerical values and print addition of two numbers.
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/

import java.util.Scanner;
class Numberformat{
  int test(int a,int b)
  {
     return (a+b);
  }

public static void main(String args[]){

    Scanner sc=new Scanner(System.in);   

    NumberFormatException obj=new NumberFormatException ();  
   
    System.out.println("Enter a value");
    String y=sc.next();                    
    System.out.println("Enter b value");
    String z=sc.next();
   
    int c=Integer.parseInt(z);
    int d=Integer.parseInt(y);
    
    System.out.println("addition is:"+obj.test(c,d));
  }
   
}

