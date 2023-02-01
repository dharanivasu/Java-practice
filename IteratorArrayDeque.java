/* JFM1T13_Assignment2:

     Write a program to iterate through all elements in an ArrayDeque.Using iterator method
     Prompt the user input from the terminal.
     
     Sample Input: 12,31,6,23,90

     Expected Output:  
     ArrayDeque: [12, 31, 6, 23, 90]
     The iterator values are: 
     12
     31
     6
     23
     90
*/

import java.util.*;
  
public class IteratorArrayDeque {
    public static void main(String args[])
    { 
      //int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
         System.out.println("how many number you want");
       int num=sc.nextInt();
       System.out.println("Enter the numbers :");
         
      for(int i=0;i<num;i++){
        deque.add(sc.nextInt());
      }
       
        System.out.println("ArrayDeque: " + num);
  
       
        Iterator value = deque.iterator();
  
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}