/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/
import java.util.Scanner;

public class IntToString {

public static void main(String args[])
  {
   int  n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the input string");
    n=sc.nextInt();
    String st=Integer.toString(n);
    System.out.println("char at index position 2 = "+st.charAt(2));
    
  }
}

