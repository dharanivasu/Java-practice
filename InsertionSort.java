/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/

import java.util.*;

public class InsertionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   
    System.out.print("Enter the numbers : ");
    String a = sc.nextLine();
   
    String nums[] = a.split(",");
    int arr[] = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      arr[i] = Integer.parseInt(nums[i].trim());
    }

   
    insertionSort(arr);

    
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int current = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }
    System.out.println("After sorting element");
  }
}