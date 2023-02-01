/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/
import java.util.Scanner;

public class GroceryItems {
 
public static void main(String args[])
     {
       
         Scanner sc=new Scanner(System.in);
         int n;     
         System.out.println("Enter the size of the array");
         n=sc.nextInt(); 
       int arr[]=new int[n];   
        System.out.println("Enter the array");  
      
        for(int i=0;i<n;i++)     
        {
          
         arr[i]=sc.nextInt();
        }
         
      
        for(int i=0;i<n;i++)   
        {
            for(int j=i+1;j<n;j++)   
            {
                if(arr[i]<arr[j])    
                {
                  int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       

        System.out.println("The highest price you incurred is "+arr[0]);    
        
    }
}


//Good
