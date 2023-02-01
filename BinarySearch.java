/* JFM1T11_Assignment2:

   Write a program to execute the search of a number in a sorted array following the below logic: 
   If the target element is greater than middle element then you go to the middle of the right of the remaining numbers 
   or otherwise towards middle of the left of the remaining numbers. 
   Continue until the number is either found or not found.
   Prompt the user input from the terminal.
   
   Sample Input: 2,5,10,12,15,20,25,31,40
   Enter number to search x= 20

   Expected Output: Position of element is : 6
   
   Enter number to search x= 26
   Expected Output: Sorry,Key doesn't exist in the array
   
*/


import java.util.*;

public class BinarySearch {
  public static void main(String args[]) {
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter the numbers : ");
    String inputString = Sc.nextLine();
  
    String[] num = inputString.split(",");
    int[] arr = new int[num.length];
    for (int i = 0; i < num.length; i++) {
      arr[i] = Integer.parseInt(num[i].trim());
    }

    
    System.out.print("Enter number to search: ");
    int x = Sc.nextInt();

    
    int position = binarySearch(arr, x);

    if (position == -1) {
      
      System.out.println("Sorry,Key " + x + " doesn't exist in the array");
    } else {
     
      System.out.println("Position of element is: " + position);
    }
  }

  public static int binarySearch(int[] arr, int a) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == a) {
       
        return mid;
      } else if (arr[mid] < a) {
        
        low = mid + 1;
      } else {
        
        high = mid - 1;
      }
    }

    // The number was not found
    return -1;
  }
}