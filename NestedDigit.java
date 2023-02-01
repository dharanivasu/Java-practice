import java.util.Scanner;
class NestedDigit{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter a character");
    char ch=Sc.next().charAt(0);
    if(ch>='0')
    System.out.println("Given character is digit");
    else if(ch<='9')
      System.out.println("Given character is digit");
    else
      System.out.println("Given character is not digit");
  }
}
  