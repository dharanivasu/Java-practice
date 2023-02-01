import java.util.Scanner;
class Digit{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the digit");
    int num=Sc.nextInt();
    if(num >=0){
      System.out.println("its digit");
    }else{
      System.out.println("its not digit");
    }
  }
}