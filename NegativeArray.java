import java.util.Scanner;

 

public class NegativeArray {
  public void negitiveArray(int arr[]) {

 

    System.out.println("negitive number of");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        System.out.println(arr[i]);
      }
    }
  }

 

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    NegativeArray n1 = new NegativeArray();
    System.out.println("Enter value");
    int n = sc.nextInt();
    System.out.println("enter" + n + "values");
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    n1.negitiveArray(arr);
  }
}