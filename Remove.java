// 6 Write a Java program to remove the third element from a array list.
 import java.util.*;
   class Remove {
  public static void main(String[] args) {
 
  List<String> list = new ArrayList<String>();
  list.add("Apple");
  list.add("Berry");
  list.add("Orange");
  list.add("Banana");
  list.add("Kiwi");
 
  System.out.println(list);
    list.remove(2);
    System.out.println("After removing third element: " +list);
  }
   }