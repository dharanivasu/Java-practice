/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

import java.util.Scanner;
class Mean 
{
   public static void main(String args[]) 
    { 
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number"); 
	int n=sc.nextInt();
	double[] input=new double[n];
	System.out.println("enter n elements");
	double sum=0;
	for(int i=0;i<n;i++) 
	{
		input[i]=sc.nextDouble();
		sum=sum+input[i];
	}
       System.out.println("Mean :"+sum/n);  
   }
}