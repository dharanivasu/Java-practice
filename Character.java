import java.util.Scanner;
class Character{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the character");
    char ch=Sc.next().charAt(0);
    if(ch>='a' && ch<='z')
      System.out.println("its a alphabet");
    else if(ch>='0')
      System.out.println("its a digit");
    else
      System.out.println("its a special character");
  }
}