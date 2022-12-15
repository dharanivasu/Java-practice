// 8 Write a Java program to sort a given array list

import java.util.*;
   class Sort {
  public static void main(String[] args) {
 
  List<String> list = new ArrayList<String>();
  list.add("Rose");
  list.add("Lily");
  list.add("Lotus");
  list.add("Sunflower");
  list.add("Poppy");
     System.out.println("Before Sorting : " + list);
    Collections.sort(list);
     System.out.println("After Sorting : " + list);
  }
   }