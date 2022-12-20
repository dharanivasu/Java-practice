// 17. Write a JAVA program to check whether a number is palindrome or not.
import java.util.*;
class PalindromeOrnot
{  
 public static void main(String args[])
 {  

  int r,sum=0,temp;    
  int number;
 Scanner sc = new Scanner(System.in);  
 System.out.println("Enter any number ");  
 number = sc.nextInt(); 
 
 temp=number;    

  while(number>0)
{    
   r=number%10;  
   sum=(sum*10)+r;    // reversing number 
   number=number/10;    
  }    

  if(temp==sum)    
   System.out.println("palindrome number "+ temp);    
  else    
   System.out.println("not palindrome" + temp);    
}  
}  