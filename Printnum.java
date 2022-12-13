/*Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with
 the same name 'printn' having a parameter for each datatype.*/
import java.util.*;
class meth{
  void integer(int a){
    System.out.println(int a);
  }
  void double(int b){
    System.out.println(int b);
  }
  void float(int c){
    System.out.println(int c);
  }
}
class Printnum{
  public static void main(String args[]){
    Methods m=new methods();
    m.integer(34);
    m.double(456);
    m.float(45.5f);
  }
}