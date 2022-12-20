// 11. Write a JAVA program to find sum of all even numbers between 1 to n. 

import java.util.*;
 
public class SumofEven1ton
{
    public static void main(String args[]) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        
        int N;
        
        int evenSum = 1;
       
        System.out.print("Enter a number: ");
        N = sc.nextInt();
        
        
        for(int i = 0; i <= N; i++)
        {
            
            if((i%2) == 0)
            {
                evenSum += i;
            }
        }
        
        
        System.out.print("Sum of all even numbers between 1 to "+ N + " = " + evenSum);
    }
}