//Create a class Main and in the main method get the usernames and store them in an ArrayList. After getting all the names, just display them in the same order.
  
import java.util.*;


public class NameArray {

    public static void main(String[] args) {
      
     ArrayList<String>  list= new ArrayList<String>();
       char ch;
       Scanner Sc=new Scanner(System.in);
      String str;
     do  {
        System.out.println("Enter username: ");
        str=Sc.next();
       list.add(str);
        System.out.println("do you want store one more username:");
          ch=Sc.next().charAt(0);
       
        }while(ch=='y');
          System.out.println("for loop");
       for(String i:list){
         System.out.println(i);
       }
        }
    }
