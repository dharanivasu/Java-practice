import java.util.*;
class Student{
  int rollno;
  String name;
  int mark;
  char grade;
  String branch;
  }
class Student1{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    Student s[]=new Student[5];
    for(int i=0;i<5;i++){
      s[i]=new Student();
      System.out.println("Enter Student "+ (i+1)+" details" );
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
    for(int i=0;i<5;i++){
      System.out.println(s[i].rollno+" "+s[i].name+" "+s[i].mark+" "+s[i].grade+" "+s[i].branch);
   
    }
  }
  
}