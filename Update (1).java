// 5 Write a Java program to update specific array element by given element.

 import java.util.*;
   class Update {
  public static void main(String[] args) {
 
  List<String> list = new ArrayList<String>();
  list.add("Apple");
  list.add("Berry");
  list.add("Orange");
  list.add("Banana");
  list.add("Kiwi");
 
  System.out.println(list);
    list.set(2, "Gava");
    list.set(0, "Mango");
    System.out.println(list);
  }
   }
