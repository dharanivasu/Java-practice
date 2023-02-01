/*   JFM1T12_Assignment3:

     Write a program to copy one arraylist into another.
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     5
     Enter Number 0
     5
     Enter Number 1
     4
     Enter Number 2
     3
     Enter Number 3
     2
     Enter Number 4
    
    Expected Output:
    -----Iterating over the second ArrayList----
     5
     4
     3
     2
     1

*/

import java.util.*; 
import java.util.ArrayList; 

class CopyArrayList  { 
  public static void main(String[] args) {
    int a[]=new int[5];
    int b[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many numbers you want: ");
    System.out.println("Enter number");
   // num=sc.nextInt();
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Enter first array element");
    for(int i=0;i<5;i++){
      System.out.println(a[i]+" ");
    }
    System.out.println("Enter second array element");
    System.out.println("-----Iterating over the second ArrayList----");
    for(int i=0;i<5;i++){
      b[i]=a[i];
      System.out.println(b[i]+" ");
    }
 }
}

