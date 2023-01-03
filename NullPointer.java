
    /*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
import java.util.*;
class Student{
   
    int marks;
    String name;
    String city;

    void setName(String name)
    {
      this.name=name;
    }
    String getName()
    {
      return this.name;
    }
    void setMarks(int marks)
    {
      this.marks=marks;
    }
    int getMarks()
    {
      return marks;
    }
    void setCity(String city)
    {
      this.city=city;
    }
    String getCity()
    {
      return city;
    }
  }
public class NullPointer
  {

    public static void main(String args[])
  {

    Student st=new Student();
    String a=null;
    st.setName(a);
    st.setMarks(200);
    st.setCity("Chennai");

    System.out.println("student name is:"+st.getName()+"student marks are: "+st.getMarks()+"student belong to: "+st.getCity());
   
     System.out.println(a.length());
   
    }
}