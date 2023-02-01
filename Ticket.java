import java.util.Scanner;
class Ticket{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter your age");
    int age=Sc.nextInt();
    if(age>=15){
      System.out.println("Well come to the show");
    }else{
      System.out.println("Please note that you should be accompanied by an adult");
    }
  }
}