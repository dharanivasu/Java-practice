/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

import java.util.Scanner;
class Pattern{
  public static void main(String args[]){
    int a=1;
    for(int i=0;i<5;i++){
      for(int j=0;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}