//custom exception for name should be greaterthn 5 char invalid exception.
//custom exception marks should be lessthan 200 invalid marks
//read data from file we need to read sname and marks check two exceptions then we can print data.
import java.util.*;
import java.io.*;
class InvalidNameException extends Exception {
  public InvalidNameException(String name) {
    super(name);
  }
}

class InvalidMarksException extends Exception {
  public InvalidMarksException(String mark) {
    super(mark);
  }
}
class CoustomExcStudent{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    try{
      String name=sc.next();
      int mark=sc.nextInt();
       if (name.length() > 5) {
        throw new InvalidNameException("custom exception for name should be greaterthn 5 char invalid exception.");
      }
       if (mark < 200) {
        throw new InvalidMarksException("custom exception marks should be lessthan 200 invalid marks");
      }
      System.out.println("Name" +name);
      System.out.println("mark" +mark);
    }
    catch (nameException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (markException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
  public static String name() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("name.txt"));
  }
}