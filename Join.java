// 15 Write a Java program to join two array lists.
import java.util.*;
  
public class Join {
    public static void main(String args[])
    {
  
 ArrayList<String>
            list1 = new ArrayList<String>();
  
        
        list1.add("bobie");
        list1.add("Hi");
        list1.add("how");
  
        System.out.println("ArrayList 1: "
                           + list1);
  
        
        ArrayList<String>
            list2 = new ArrayList<String>();
  
        list2.add("are");
        list2.add("you?");
  
       
        System.out.println("ArrayList 2: "
                           + list2);
  
        
        list1.addAll(list2);
  
       
        System.out.println("Joined ArrayLists: "
                           + list1);
    }
}