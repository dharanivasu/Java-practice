// 19 Write a Java program to trim the capacity of an array list the current list size
import java.util.ArrayList;

  public class Trim {
  public static void main(String[] args) {
          ArrayList<String> a= new ArrayList<String>();
          a.add("Red");
          a.add("Green");
          a.add("Black");
          a.add("White");
          a.add("Pink");
          System.out.println("Original array list: " + a);
          System.out.println("Let trim to size the above array: ");
          a.trimToSize();
   // a.add("dark");
          System.out.println(a);
   }
}