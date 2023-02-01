/*A Student is an object in a university management System. Analyze the concept andidentify the data members   that   a   Student   class   should   have.   Also   analyze   thebehavior   of  student  in   a   university management System and identify the methodsthat should be included in Student class*/


  import java.util.*;
class Student{
  int rollno;
  String name;
  int mark;
  char grade;
  String branch;
  Scanner Sc=new Scanner(System.in);
  void input(){
    int i=0;
     System.out.println("enter the roll no");
      int rollno=Sc.nextInt();
      System.out.println("enter the name");
      char name=Sc.next().charAt(0);
      System.out.println("enter the mark");
      int mark=Sc.nextInt();
      System.out.println("enter the grade");
      char grade=Sc.next().charAt(0);
      System.out.println("enter the branch");
      char branch=Sc.next().charAt(0);
  }
  void display(){
    System.out.println("roll no"+rollno);
    System.out.println("name"+name);
    System.out.println("mark"+mark);
    System.out.println("grade"+grade);
    System.out.println("branch"+branch);
  }
  class Ab{
    public static void main (String args[]){
      Student stu[]=new Student[5];
      for(int i=0;i<5;i++){
        stu[i]=new Student();
        stu[i].input();
      }
      for(int i=0;i<5;i++){
        stu[i].display();
      }
    }
  }
  }
