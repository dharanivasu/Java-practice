// 12 Write a Java program to extract a portion of a array list

import java.util.*;
   class Extract {
  public static void main(String[] args) {
 
  List<String> list = new ArrayList<String>();
  list.add("Bently");
  list.add("Royce");
  list.add("BMW");
  list.add("Susuki");
  list.add("Citron");
  System.out.println("Original list: " + list);
  List<String> sub_List = list.subList(1, 4);
  System.out.println("List of first three elements: " + sub_List);
 }
}