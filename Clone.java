// 16 Write a Java program to clone an array list to another array list.
import java.util.ArrayList;

  public class Clone {
  public static void main(String[] args) {
     ArrayList<String> list= new ArrayList<String>();
          list.add("Red");
          list.add("Green");
          list.add("Black");
          list.add("White");
          list.add("Pink");
          System.out.println("list " +list);
          ArrayList<String> newlist = (ArrayList<String>)list.clone();
          System.out.println("Cloned array list: " + newlist);       
}
  }