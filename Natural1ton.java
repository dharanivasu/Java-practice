// 5. Write a JAVA program to print all natural numbers from 1 to n. - using while loop 

import java.util.*;

public class Natural1ton {
	
	public static void main(String[] args) 
	{
		int number, i = 1;
	Scanner	sc = new Scanner(System.in);
		
		System.out.print("  Enter any Number : ");
		number = sc.nextInt();	
		
		while(i <= number)
		{
			System.out.print(i +"\t"); 
			i++;
		}	
	}
}