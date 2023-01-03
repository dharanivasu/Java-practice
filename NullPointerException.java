/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
public class NullPointerException {

  public static void main(String[] args) {
    
    Student student = new Student();

    
    printStudentInfo(student);
  }

  public static void printStudentInfo(Student student) {
    // This will cause a NullPointerException to be thrown when the student object is null
    System.out.println("Name: " + student.getName());
    System.out.println("Marks: " + student.getMarks());
    System.out.println("City: " + student.getCity());
  }
}

class Student {
  private String name;
  private int marks;
  private String city;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
