// 3 Write a Java program to insert an element into the array list at the first position

import java.util.*;
class Insert{
  public static void main(String args[]){
    List<String> list=new ArrayList<String>();
    list.add("green");
    list.add("black");
    list.add("pink");
    System.out.println(list);
    list.add(0, "Orange");
    list.add(2, "Yellow");
    System.out.println(list);
  }
}