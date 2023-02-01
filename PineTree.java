import java.util.Scanner;
class PineTree{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    String name=sc.nextLine();
    int n=name.length();
    if(n<=50){
    System.out.println("Hello "+name+" ! Welcome to Amphi Event Management System");
    }
  }
}