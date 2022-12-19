import java.util.*;
class Capacity{
public static void main(String[] args) { 
  
  ArrayList<String> list= new ArrayList<String>(4);
  
  list.add("Red");
  list.add("Green"); 
  list.add("Black"); 
  System.out.println("Original array list: " + list); 
 // list.add("Yellow");
 // list.add("blue");
 // System.out.println(list);
 // Increase capacity to 6 list.ensureCapacity(6); 
  list.add("White"); 
  list.add("Pink"); 
  list.add("Yellow");
  System.out.println("New array list: " + list);
}
                                       }

