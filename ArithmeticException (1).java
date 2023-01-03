/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
import java.util.*;
class ArithmeticException{
  public static void main(String args[]){
  int a,b;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println((a/b));  //occurs this place ArithmeticException
    System.out.println(a);
    System.out.println(b);
  }
}  

/*public class ArithmeticException {

  public static void main(String[] args) {
    // Call the divide method and pass in values that will cause an ArithmeticException
    divide(1, 0);
  }

  public static void divide(int a, int b) {
    // This will cause an ArithmeticException to be thrown when b is 0
    int result = a / b;
    System.out.println("Result: " + result);
  }
}  */