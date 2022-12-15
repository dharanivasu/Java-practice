// 18 Write a Java program to test an array list is empty or not
import java.util.ArrayList;

  public class Empty1 {
  public static void main(String[] args) {
          ArrayList<String> a= new ArrayList<String>();
          a.add("A");
          a.add("B");
          a.add("C");
          a.add("D");
          a.add("E");
          System.out.println("Original array list: " +a);
          System.out.println("Checking the above array list is empty or not! "+a.isEmpty());
          a.removeAll(a);
          System.out.println("Array list after remove all elements "+a);   
          System.out.println("Checking the above array list is empty or not! "+a.isEmpty());
   }
}