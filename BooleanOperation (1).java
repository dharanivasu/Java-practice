//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.Scanner;
public class BooleanOperation {
//main method
  public static void main(String args[]){
//Use the scanner class to provide input at execution time using scanner object
    Scanner sc=new Scanner(System.in);
    //Take input from user
    System.out.println("Enter x as boolean value(true/false): ");
    boolean x=sc.nextBoolean();
    System.out.println("Enter y as boolean value(true/false): ");
    boolean y=sc.nextBoolean();
    boolean a=x&&y;
    boolean b=x||y;
    boolean c=!x;
    boolean d=!y;
    //print apppropriate result for boolean operations
    System.out.println("x&&y: "+a);
    System.out.println("x||y: "+b);
    System.out.println("!x: "+c);
    System.out.println("!y: "+d);
  }