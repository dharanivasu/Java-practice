import java.util.Scanner;
class Big{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    int a=Sc.nextInt();
    int b=Sc.nextInt();
    int c=Sc.nextInt();
    if(a>b && a>c)
      System.out.println("a is big");
    else if(b>a && b>c)
      System.out.println("b is big");
  }
}