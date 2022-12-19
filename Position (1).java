// 22 Write a Java program to print all the elements of a ArrayList using the position of the elements

import java.util.ArrayList;
  public class Position {
    public static void main(String[] args) {
  ArrayList <String>  d= new ArrayList <String> ();
  d.add("Royce");
  d.add("Audi");
  d.add("BMW");
  d.add("Fari");
  d.add("Bently");
  System.out.println(d);
  System.out.println("using index of an element: ");
  int elements = d.size();
  for (int index = 0; index < elements; index++)
   System.out.println(d.get(index));
 }
}