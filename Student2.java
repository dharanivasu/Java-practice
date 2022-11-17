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
      s[i].rollno=Sc.nextInt();
      System.out.println("enter the name");
      s[i].name=Sc.next();
      System.out.println("enter the mark");
      s[i].mark=Sc.nextInt();
      System.out.println("enter the grade");
      s[i].grade=Sc.next().charAt(0);
      System.out.println("enter the branch");
      s[i].branch=Sc.next();
  }
  void display(){
    System.out.println("roll no"+roll);
    System.out.println("name"+name);
    System.out.println("mark"+mark);
    System.out.println("grade"+grade);
    System.out.println("branch"+branch);
  }
  class Student2{
    public static void main(String args[]){
      Student stu[]=new Student[5];
      for(int i=0;i<5;i++){
        stu[i]=new Student();
        st[i].input();
      }
      for(int i=0;i<5;i++){
        stu[i].display();
      }
    }
  }
  }