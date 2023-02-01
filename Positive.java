import java.util.Scanner;
class Positive{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=Sc.nextInt();
    if(num>=0)
      System.out.println("its positive number");
    else
      System.out.println("its not positive number");
  }
}