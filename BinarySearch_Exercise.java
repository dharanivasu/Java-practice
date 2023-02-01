/* 1. Write a program to find target element in the given array using binary 
      search technique and check if the target element is prime number or not.

      Sample Input1: A = [23,45,67,78,86,90]
                      Target element is: 67
      Expected Output:  67 is present in 2nd index position and it is prime number

      Sample Input2: A = [23,45,67,78,86,90]
                     Target element is: 86
      Expected Output:  86 is present in 4th index position and it is not a prime number
*/
import java.util.Arrays;

public class BinarySearch_Exercise {
    public static void main(String[] args) {
        int[] A = {23, 45, 67, 78, 86, 90};
        int target = 86;

        // Perform binary search to find target element
        int result = binarySearch(A, target);

        if (result == -1) {
            System.out.println("Target element not found in array");
        } else {
            // Check if target element is prime
            if (isPrime(target)) {
                System.out.println(target + " is present in " + (result + 1) + " index position and it is a prime number");
            } else {
                System.out.println(target + " is present in " + (result + 1) + " index position and it is not a prime number");
            }
        }
    }

    // Implement binary search to find target element in array
    public static int binarySearch(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == target) {
                return mid;
            } else if (A[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
