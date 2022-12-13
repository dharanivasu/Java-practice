 import java.util.*;
class Student1{
  private int id;//instance 
  private String name;
  private String grade;
  private int mark;
  //setters and getters
  //assign the values to private variables
//this is call the current class instance variable
  void setid(int id){//local variable
   this.id=id;
  }
  void setname(String name){
    this.name=name;
  }
  void setgrade(String grade){
    this.grade=grade;
  }
  void setmark(int mark){
    this.mark=mark;
  }
    //getters
  int getid(){
    return this.id;
  }
  String getname(){
    return this.name;
  }
  String getgrade(){
    return this.grade;
  }
  int getmark(){
    return this.mark;
  }
  
}

class Student {
  public static void main(String args[]) {
  Student s[]=new Student[3];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      s[i]=new Student();
      System.out.println("Enter Student  details");
    s[i].setid(sc.nextInt());
    s[i].setname(sc.next());
    s[i].setgrade(sc.next());
    s[i].setmark(sc.nextInt());
    System.out.print(s[i].getid()+" "+s[i].getname()+" "+s[i].getgrade()+" "+s[i].getmark());
    
    }
    
  }
}
