import java.util.*;
class Try{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c;
    
    try{
      c=a/b;
      System.out.println(c);
    }
    catch(Exception e){
      System.out.println(e);
    }
     System.out.println("Exception handled");
  }
}