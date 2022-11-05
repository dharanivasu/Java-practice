import java.util.Scanner;

public class Home2 {
  private static Scanner sc;
  public static void main(String args[]){
    char ch;
    Scanner sc= new Scanner(System.in);
    System.out.println("Please Enter any character:");
    ch= sc.next().charAt(0);
    int num1= ch;
    int num2=(int)ch;
System.out.println("\n The ASCII Value of a given character"+ ch +" = "+num1);
  }
}