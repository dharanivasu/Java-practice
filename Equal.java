import java.util.Scanner;
class Equal{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=Sc.nextInt();
    if(num==0)
      System.out.println("its equal number");
    else
      System.out.println("its not equal number");
  }
}