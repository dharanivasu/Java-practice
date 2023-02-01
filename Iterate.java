// 2 Write a Java program to iterate through all elements in a array list

import java.util.*;

 class Iterate {
  public static void main(String args[]) {
    
  List<String> list = new ArrayList<String>();
  list.add("pink");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
    
   Iterator itr=list.iterator();
     for (String iterate: list) {
    System.out.println(iterate);
    }
 }






                       