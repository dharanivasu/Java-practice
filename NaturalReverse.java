// 6. Write a JAVA program to print all natural numbers in reverse (from n to 1). -     using while loop 

import java.util.Scanner;

public class NaturalReverse {
	
	public static void main(String[] args) 
	{
		int number, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Maximum integer Value : ");
		number = sc.nextInt();	
		
		i = number;
		
		while(i >= 1)
		{
			System.out.print(i +" "); 
			i--;
		}	
	}
}