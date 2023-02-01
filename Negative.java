import java.util.Scanner;
class Negative{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=Sc.nextInt();
    if(num<=0)
      System.out.println("its negative number");
    else
      System.out.println("its not negative number");
  }
}