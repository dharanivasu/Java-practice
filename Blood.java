import java.util.Scanner;
class Blood{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter a age");
   int age=Sc.nextInt();
    System.out.println("enter a weight");
    int weight=Sc.nextInt();
    if(age>18 && weight>50)
      System.out.println("eligible for blood donation");
    else 
      System.out.println("not eligible for blood donation");
  }
}