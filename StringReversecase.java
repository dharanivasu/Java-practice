//WAP to print reverse case of a given string


import java.util.*;
class UpperCase{
  public void method(){
    Scanner Sc= new Scanner(System.in);
    System.out.println("Enter String");
    String s = Sc.nextLine();
    System.out.println(s.toUpperCase());
  }
}
class lowerCase{
  public void method(){
    Scanner Sc= new Scanner(System.in);
    System.out.println("Enter String");
    String s = Sc.nextLine();
    System.out.println(s.toLowerCase());
  }
}
class StringReversecase{
  public static void main(String args[]){
    UpperCase u = new UpperCase();
    u.method();
    lowerCase l = new lowerCase();
    l.method();
    
    }
}