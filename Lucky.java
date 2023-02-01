import java.util.Scanner;
class Lucky{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the ticket number");
    int num=Sc.nextInt();
    if(t%10==3 && t%10==8){
      System.out.println("Lucky Winner");
    }else{
      System.out.println("not Lucky Winner");
    }
  }
}