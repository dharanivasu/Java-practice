import java.util.Scanner;
class Upper{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter a any character");
    char ch=Sc.next().charAt(0);
    if(ch>='a' && ch<='z')
      System.out.println("its a lower case");
    else if(ch>='A' && ch<='Z')
      System.out.println("its a upper case");
    else
      System.out.println("its not alphabet");
  }
}