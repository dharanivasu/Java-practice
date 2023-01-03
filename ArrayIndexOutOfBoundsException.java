/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array. 
      Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/

import java.util.*;

public class ArrayIndexOutOfBoundsException {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values :");
   // System.out.println("Enter the arr1 values :");
    //int arr1=sc.nextInt();
    int[] arr1 = {2, 3, 5, 7, 11};
    //System.out.println("Enter the arr2 values :");
    //int arr2=sc.nextInt();
    int[] arr2 = {23, 29, 31, 37, 38,40,41};
    int[] arr3 = new int[arr1.length + arr2.length];

    int index = 0;
    try {
      
      for (int i = 0; i < arr1.length; i++) {
        if (isPrime(arr1[i])) {
          arr3[index] = arr1[i];
          index++;
        }
      }

      
      for (int i = 0; i < arr2.length; i++) {
        if (isPrime(arr2[i])) {
          arr3[index] = arr2[i];
          index++;
        }
      }
    } catch (Exception e) {
      System.out.println("storing values in array3");
    }

    
    System.out.println(Arrays.toString(arr3));
  }

  //  to check if a number is prime
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