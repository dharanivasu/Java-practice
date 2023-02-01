/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {
  public static void main(String args[]){
    String s1="a1b2c3";
    for (int i=0;i<s1;i++){
      for (int i=0;i<s1.length();i++){
        for(int i=s1.length()-1;i>=0;i--){
          System.out.println(s1.charAt(i));
          String s1="madam";
          for(int i=s1.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);
            
          }
          System.out.println(rev);
        }
        if(s1.equals(rev)){
          System.out.println("palindrome");
        }
        else {
          System.out.println("Not palindrome");
        }
      }
    }
  }

}
// good
