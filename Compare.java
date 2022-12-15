// 13 Write a Java program to compare two array lists\
import java.util.*;
  class Compare {
  public static void main(String args[]) {
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
     if (List1.equals(List2) == true) {
            System.out.println(" Array List are equal");
        }
        else
        
        {
            System.out.println(" Array List are not equal");
        }
  }
  }