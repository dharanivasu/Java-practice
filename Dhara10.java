//Strong number

//If the sum of the factorial of digits of a number (N) is equal to the number itself, the number (N) is called a special number.

//Consider a number 145 and check it is a special number or not.
//The digits of the number are: 1, 4, 5

//Factorial of digits:

//!1 = 1

//!4 = 4*3*2*1 = 24

//!5 = 5*4*3*2*1 = 120

//Sum of factorial of digits = 1 + 24 + 120 = 145

//Compare the sum of the factorial of digits with the given number, i.e. 145 = 145. We observe that both are equal.
import java.util.*;
class Dhara10{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
    int n=sc.nextInt();//145
    int rem,fact,sum=0;
    int temp=n;
    while(n>0){
      rem=n%10;//5
      fact=1;
      for(int i =1;i<=rem;i++){
        fact=fact*i;
        
      }
      System.out.println(fact);
      sum=sum+fact;
      n=n/10;
      
    }
    System.out.println(sum);
    if(sum==temp){
      System.out.println("strong number");
    }
    else{
      System.out.println("not strong number");
    }
    
    }
  }