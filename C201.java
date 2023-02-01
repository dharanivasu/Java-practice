import java.util.*;
class C201{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter num1");
    int num1=Sc.nextInt();
    System.out.println("enter num2");
    int num2=Sc.nextInt();
   // double num1,num2;
   double result=StrictMath.pow(num1,num2);
    System.out.println(result);
  }
}