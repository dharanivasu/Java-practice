import java.util.Scanner;
class Number{
  public static void main (String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=Sc.nextInt();
    if(num%5==0 && num%3==0)
      System.out.println("number is divisible by 5 and 3");
    else
      System.out.println("not divisible by 5 and 3");
  }
}