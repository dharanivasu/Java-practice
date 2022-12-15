// 4 Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;
   class Retrieve {
  public static void main(String[] args) {
 
  List<String> list = new ArrayList<String>();
  list.add("Apple");
  list.add("Berry");
  list.add("Orange");
  list.add("Banana");
  list.add("Kiwi");
 
  System.out.println(list);
  // Retrive the first and third element
  String element = list.get(0);
  System.out.println("First element: "+element);
  element = list.get(4);
  System.out.println("Last element: "+element);
 }
}