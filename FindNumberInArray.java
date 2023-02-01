/* JFM1T11_Assignment1:

   Write a program to find a number in an integer array. If found print the number and the array index at which it is found. 
   Prompt the user input from the terminal.
   
   Sample Input: 2,4,6,1,7,8,9
   Enter number to search x= 9

   Expected Output: 9 found at index 6
   
   Enter number to search x= 12
   Expected Output: Sorry! 12 is not found in array.
   
*/

import java.util.*;

public class FindNumberInArray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Enter the numbers: ");
    String a = sc.nextLine();
    
    String nums[] = a.split(",");
    int arr[] = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      arr[i] = Integer.parseInt(nums[i].trim());
    }

    
    System.out.print("Enter number to search: ");
    int b = sc.nextInt();

    
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == b) {
        index = i;
        break;
      }
    }

    if (index == -1) {
      
      System.out.println("Sorry! " + b + " is not found in array.");
    } else {
      
      System.out.println(b + " found at index " + index);
    }
  }
}