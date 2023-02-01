/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.*;
class TwoDimentionalArray {


    public static void main(String args[]){
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter the rows and column");
      
      int n1=Sc.nextInt();
      int n2=Sc.nextInt();
      int i,j;
      
      int a[][]=new int[n1][n2];
     
      for( i=0;i<n1;i++){
         for( j=0;j<n2;j++){
            
            System.out.print("Enter arr " + "[ " + i + " ]" + "[ " + j + " ] : ");
            a[i][j]=Sc.nextInt();
         }
      }
      int max=a[0][0];
      int index1=0,index2=0;
      
      for( i=0;i<n1;i++){
         for( j=0;j<n2;j++){
           
            if(a[i][j]>max){
               max=a[i][j];
              
               
              index1=i;
              index2=j;
            }
            

         }
         
      }
 

       System.out.print("Largest element in array is  " +max+ " arr " + "[ " + index1 + " ]" + "[ " + index2 + " ]  ");
       
   }
}

//Good
