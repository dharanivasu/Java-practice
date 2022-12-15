// 7 Write a Java program to search an element in a array list
import java.util.*;
   class Search {
  public static void main(String[] args) {
 
  List<String> list = new ArrayList<String>();
  list.add("Rose");
  list.add("Lily");
  list.add("Lotus");
  list.add("Sunflower");
  list.add("Poppy");

     if (list.contains("Lily")) {
    System.out.println("Found ");
    } else {
    System.out.println("Not found");
    }
  }
   }