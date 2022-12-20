// 8. Write a JAVA program to print all even numbers between 1 to 100. - using while     loop 
import java.util.Scanner;  
public class Even1to100  
{  
public static void main(String[] args)   
{  
int number, i;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the numbers: ");  
number = sc.nextInt();    
i=2;   
System.out.print(" even numbers is : ");  
 
while(i<=number)  
{  
  
System.out.print(i +" ");   

i=i+2;  
}     
}  
}  