/* JFM1T13_Assignment1

     Write a program to create a priority queue, add some colors (string) and print out the elements of the priority queue. 
     Prompt the user input from the terminal.
     
     Sample Input: 
     Enter how many colors you want: 
     5
     Enter Colors: 
     red
     white
     green
     orange
     black
     
     Expected Output:
     Elements of the Priority Queue:  black, green, orange, red, white 
*/
import java.util.*;

public class Priority {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   
    PriorityQueue<String> priority = new PriorityQueue<String>();
    System.out.print("Enter how many colors you want:");
     int n=sc.nextInt();
     System.out.println("Enter Colors:");
     for(int i=0;i<n;i++){
     priority.add(sc.next());
  }
    System.out.print("Elements of the Priority Queue:");
    String str=" ";
     for(int i=0;i<n;i++){
     System.out.print(str+priority.poll());
    str=",";
     }
  }
}