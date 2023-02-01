/* JFM1T11_Assignment4 :

   Write a program to sort an array of numbers in ascending order by comparing each number with every other number in 
   an array so that after each pass/iteration the smallest element reaches at it’s correct position. 

   Prompt the user input from the terminal.
   
   Sample Input: 4,6,3,9,10
   
   Expected Output: 10,9,6,4,3

 */

import java.util.*;

public class AscendingOrder {
	public static void main(String args[]){
		int Size, i, j, Temp;
	Scanner	sc = new Scanner(System.in);
	 
		System.out.print("Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int a[] = new int[Size];
		
		System.out.print("Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < Size; i++)
		{
			for (j = i + 1; j < Size; j++)
			{
				if(a[i] < a[j])
				{
					Temp = a[i];
					a[i] = a[j];
					a[j] = Temp;
				}
				
			}
		}
		
		System.out.print("\n Result Array after Ascending Order :  ");
		for (i = 0; i < Size; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
