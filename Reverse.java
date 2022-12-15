// 11 Write a Java program to reverse elements in a array list.
import java.util.*;
  public class Reverse {
  public static void main(String args[]) {
 
  List<String> list = new ArrayList<String>();
  list.add("Car");
  list.add("bike");
  list.add("Cycle");
  list.add("larry");
  list.add("auto");
  System.out.println("List before reverse:\n" + list);  
  Collections.reverse(list);
  System.out.println("List after reverse:\n" + list); 
 }
}