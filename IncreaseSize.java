// 20 Write a Java program to increase the size of an array list

import java.util.ArrayList;

  public class IncreaseSize {
  public static void main(String[] args) {
         ArrayList<String> list= new ArrayList<String>(3);
         list.add("Audi");
         list.add("BMW");    
         list.add("Bugatti");
          System.out.println("Original array list: " + list);
          
         list.ensureCapacity(6);
         list.add("Ford");
         list.add("Honda");
         list.add("Hyundai");
         // list.add("Ferrari");
         System.out.println("New Increased array list: " + list);
   }
}