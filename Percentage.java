//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage {
public static void main(String args[]){
  int maximum_marks, total_marks;
  Scanner sc=new Scanner(System.in);
  double maximumScore=348,totalScore=500;
  float Percentage;
  System.out.println("Enter the total marks:");
  total_marks=sc.nextInt();
  System.out.println("Enter maximum marks possible: ");
  maximum_marks=sc.nextInt();
  Percentage =(float)((maximumScore*100)/totalScore);
  System.out.println("Percentage = "+Percentage);
}
}

