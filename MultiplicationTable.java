// 13. Write a JAVA program to print multiplication table of any number. 
import java.util.*;
class MultiplicationTable {
    public static void main(String[] args)
    {
        
        int N = 6;
 
      
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(N + " * " + i + " = "
                               + N * i);
        }
    }
}