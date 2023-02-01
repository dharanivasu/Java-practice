/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/
import java.util.*;
class Temperature{
  public static void main(String args[]){
    int totaltemp=0;
    double temp[]=new double[7];
    Scanner Sc=new Scanner(System.in);
    for(int i=0;i<7;i++){
      System.out.println("enter the temperature of day" + (i+1)+ ": ");
      temp[i]=Sc.nextDouble();
    }
    for(int i=0;i<7;i++){
      if(totaltemp == temp[i]){
        System.out.println();
      }
    }
    System.out.println("enter the number of day is :" +temp.length);
    System.out.println("the average temperature for the week is:" +(totaltemp/temp.length));
  }
}

//Kindly check your logic
