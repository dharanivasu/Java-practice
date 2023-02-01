import java.util.Scanner;
class Fantasy{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter your age");
    int age=Sc.nextInt();
    if(age<15){
      System.out.println("Child ticket");
    }else{
      System.out.println("Adult ticket");
    }
  }
}