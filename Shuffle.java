// 10 Write a Java program to shuffle elements in a array list.
import java.util.*;
  public class Shuffle {
  public static void main(String args[]) {
 
  List<String> list = new ArrayList<String>();
  list.add("Car");
  list.add("bike");
  list.add("Cycle");
  list.add("larry");
  list.add("auto");
  System.out.println("List before shuffling:\n" + list);  
  Collections.shuffle(list);
  System.out.println("List after shuffling:\n" + list); 
 }
}