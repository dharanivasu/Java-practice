/* 2. Given an array of n integers. Write an efficient java code using merge sort algorithm to 
      find the sum of  First and last element i. e., smallest and largest elements in the array. 
      also print the sorted array.
      Sample Input:- n=5 , arr=[1,4,2,3,5]
      Expected Output:- Sum is 6
      Smallest Element : 1
      Largest element : 5
*/



   import java.util.Arrays;

public class MaxMinSum_Exercise {
    public static void main(String args[]) {
        int n = 5;
        int arr[] = {1, 4, 2, 3, 5};

        mergeSort(arr, 0, n - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int smallest = arr[0];
        int largest = arr[n - 1];
        int sum = smallest + largest;
        System.out.println("Sum is: " + sum);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int arr[], int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + j + 1];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

