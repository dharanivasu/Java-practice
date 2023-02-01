/* 1. Write a program to accept n values into an array, and  write a code to build a min-heap of that array.
      Sample Input:- n=7, arr =[ 3, 13, 7, 16, 21, 12, 9]
      Expected Output:- 
      Parent : 3 Left : 13 Right :7
      Parent : 13 Left : 16 Right :21
      Parent : 7 Left : 12 Right :9
*/



   import java.util.Scanner;

public class MinHeap_Exercise {
    static int arr[];
    static int n;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];

        
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Build the min-heap
        buildMinHeap();

        // Print the min-heap
        printMinHeap();
    }

    public static void buildMinHeap() {
        // Start at the last non-leaf node  
        for (int i = (n / 2) - 1; i >= 0; i--) {
            minHeapify(i);
        }
    }

    public static void minHeapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minHeapify(smallest);
        }
    }

    public static void printMinHeap() {
        for (int i = 0; i < n; i++) {
            System.out.print("Parent : " + arr[i] + " Left : ");
            if (2*i+1<n) System.out.print(arr[2*i+1]);
            System.out.print(" Right : ");
            if (2*i+2<n) System.out.println(arr[2*i+2]);
        }
    }
}