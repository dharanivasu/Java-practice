/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException.
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console.
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/

import java.util.*;
class ArrayIndexof{
  public static void main(String args[]){
    int arr[]={20,40,59,60};
    try{
      System.out.println(arr[4]);
    }
    catch (Exception e){
      System.out.println(e);
    }
     System.out.println("Exception handled");
  }
}