import java.util.Scanner;
class Alphabet{
  public static void main(String args[]){
   Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the alphabet");
    char ch=Sc.next().charAt(0);
    if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
      System.out.println("its alphabet");
    }else{
      System.out.println("its not alphabet");
    }
  }
}