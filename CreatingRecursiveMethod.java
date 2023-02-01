/* 2. Write a program to create a recursive method to check the given target value is present 
      in array or not using binary search technique. If target exists, then return its index. 
      Otherwise, return -1. 

      Sample Input1: array = [-1,0,3,5,9,12], target = 9
      Expected Output: 9 exists in array and its index is 4
 
      Sample_Input2: array = [-1,0,3,5,9,12], target = 2
      Expected Output: 2 does not exist in array 
*/

public class CreatingRecursiveMethod {

  public static int binarySearch(int[] array, int target, int low, int high) {
    if (low > high) {
      return -1;
    }
    int mid = (low + high) / 2;
    if (array[mid] == target) {
      return mid;
    } else if (array[mid] > target) {
      return binarySearch(array, target, low, mid - 1);
    } else {
      return binarySearch(array, target, mid + 1, high);
    }
  }

  public static void main(String[] args) {
    int[] array = {-1, 0, 3, 5, 9, 12};
    int target = 12;
    int index = binarySearch(array, target, 0, array.length - 1);
    if (index != -1) {
      System.out.println(target + " exists in array and its index is " + index);
    } else {
      System.out.println(target + " does not exist in array");
    }
  }

}
