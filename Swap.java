// 14 Write a Java program of swap two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
   class Swap {
  public static void main(String[] args) {
   ArrayList<String> list= new ArrayList<String>();
          list.add("Red");
          list.add("Green");
          list.add("Black");
          list.add("White");
          list.add("Pink");

          System.out.println("Array list before Swap:");
          for(String a: list){
          System.out.println(a);
        }
           
         Collections.swap(list, 0, 2);
          System.out.println("Array list after swap:");
          for(String b: list){
          System.out.println(b);
         }
     }
}