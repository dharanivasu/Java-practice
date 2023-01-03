import java.util.*;
class Null{
  public static void main(String args[]){
    String str=null;
    try{
      System.out.println(str);
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println("Exception handled");
  }
}