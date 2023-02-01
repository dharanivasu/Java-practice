/*  JFM1T13_Assignment3:

      Write a Java program to count the number of key-value (size) mappings in a map. 
      Prompt the user input from the terminal.

      Sample Input: 
      Enter value:20
      Enter key:bitLabs
      Enter another student (y/n)?y
      Enter value:25
      Enter key:welcomes
      Enter another student (y/n)?y
      Enter value:30 
      Enter key:you
      Enter another student (y/n)?n

      Expected Output: The size of the map is 3
*/

import java.util.*;  
public class MapCount {  
   public static void main(String args[]){  
  HashMap<Integer,String> hashmap= new HashMap<Integer,String>();  
      boolean val = true;
         
    Scanner sc = new Scanner(System.in);
     do{
            
            System.out.print("Enter value :");
            Integer value =Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter Key :");
            String Key=sc.nextLine();
            
            String Size = hashmap.put(value,Key);
           
            if(Size!=null){
            
            System.out.println("Emp value "+value+" is "+Size+" and has been overwitten by "+Key);
            }
           
            System.out.print("Enter another student (y/n)? : ");
            String choice =sc.nextLine();
            
            if(choice.equals("y")){
                continue;
            }
            else{
                break;
            }
        }while(val);
  System.out.println("Size of the hash map: "+hashmap.size());
 }
}