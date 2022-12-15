// 17 Write a Java program to empty an array list.
import java.util.ArrayList;
 
public class Empty {
 
   
    public static void main(String[] arg)
    {
 
        
        ArrayList<String> numbers
            = new ArrayList<String>(4);
 
       
        numbers.add("10");
        numbers.add("20");
        numbers.add("30");
        numbers.add("40");
 
        
        System.out.println("Numbers ArrayList : "
                           + numbers);
 
       
        int numbers_size = numbers.size();
 
        
        System.out.println("Numbers ArrayList is : "
                       + numbers_size + " elements");
 
       
        numbers.clear();
 
        int numbers_size_new = numbers.size();
 
       
        System.out.println("Finally Numbers : "
            + numbers_size_new + " elements");
    }
}