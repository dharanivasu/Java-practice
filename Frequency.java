/* 5. Write a program a program to count the occurrence of each element in the array.
Expected Output:
---------------------------------------
 Element | Frequency
 ---------------------------------------
 1 | 2
 8 | 2
 3 | 2
 2 | 1
 5 | 3
 7 | 1
 9 | 1
 ----------------------------------------  
*/
import java.util.HashMap;
public class Frequency {

	public static void main(String args[]) {
     int[] arr = {1, 8, 3, 2, 1, 5, 5, 5, 7, 8, 9};
     HashMap<Integer, Integer> fr = new HashMap<>();
             for(int i: arr){
               if(fr.containsKey(i)) {
                fr.put(i, fr.get(i) + 1);
            } else {
                fr.put(i, 1);
             }
        }
     System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        fr.forEach((k, v) -> System.out.println(" " + k + " | " + v));
        System.out.println("----------------------------------------");
    }
}