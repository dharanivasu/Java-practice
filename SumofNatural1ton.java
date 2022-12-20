// 10. Write a JAVA program to find the sum of all natural numbers between 1 to n.

import java.util.Scanner;

public class SumofNatural1ton {
	
	public static void main(String[] args) 
	{
		int number, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("  Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			sum = sum + i; 
		}	
		
		System.out.println("\n The Sum of Natural Numbers from 1 to "+ number + " = " + sum);
	}
}