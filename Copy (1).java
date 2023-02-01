// 9 Write a Java program to copy one array list into another.
import java.util.*;
  class Copy {
  public static void main(String[] args) {
  List<String> List1 = new ArrayList<String>();
  List1.add("abc");
  List1.add("def");
  List1.add("ghi");
  List1.add("jkl");
  System.out.println("List1: " + List1);
  List<String> List2 = new ArrayList<String>();
  List2.add("ABC");
  List2.add("DEF");
  List2.add("GHI");
  List2.add("JKL");
  System.out.println("List2: " + List2);
  
  Collections.copy(List1, List2);
  System.out.println("Copy List1 to List2,\nAfter copy:");
  System.out.println("List1: " + List1);
  System.out.println("List2: " + List2);
 }
}