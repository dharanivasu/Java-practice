/* 5. Write a program to sort an array using Quick sort algorithm and accept X value from user and 
      print all the elements in the array whose values are greater than X.
      Sample Input:- n=5 , arr=[1,4,2,3,5],  x=2
      Expected Output:- number of elements greater than x is 3
      Elements are: 3, 4, 5
*/

   import java.util.Arrays;
import java.util.*;

public class LargerElements_Exercise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of X: ");
        int x = sc.nextInt();

        // Sort the array using the Quick Sort algorithm
        quickSort(arr, 0, n-1);

        
        int count = 0;
        System.out.print("Elements greater than X are: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println("\nNumber of elements greater than X is " + count);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}