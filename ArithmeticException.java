/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/

import java.util.*;
class ArithmeticException{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter the first number :");
    int a=sc.nextInt();
    System.out.println("Enter the second number :");
    int b=sc.nextInt();
    System.out.println("Enter operator (+,-,/,*) :");
    char c=sc.next().charAt(0);
    //using Swittch case
    int result=0;
    switch (c) {
      case '+':
       result=a+b;
       break;
      case '-':
       result=a-b;
       break;
      case '/':
         try {
          result = a / b;
         
        } catch (Exception e) {
          System.out.println(" Cannot divide by zero.");
         
        }
        
        break;
      case '*':
        result=a*b;
        break;
      
       
      default:
        System.out.println("Invalid operator.");
       
    }
    
    // Print the result
    System.out.println("Result: " + result);
      
    }
  }
     

