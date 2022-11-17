class sample{
  String name;
  int age;
  long phoneno;
  String address;
  int salary;
  void printsalary(){
        System.out.println(salary);
}
}
class Employee extends Member{
    String specialization;
}
class Manager extends Member{
    String Department;
  void display(){
    System.out.println(+name+" "+age+" "+phoneno+" "+address+" "+salary);
  }
}
class Member{
  public static void main(String args[]){
    Employee emp=new Employee();
    emp.name="meera";
    emp.age=25;
    emp.phoneno=9763904753L;
    emp.address="abc street,Chennai";
    emp.salary=25000;
    emp.display();
    emp.department();
    emp.specialization();
    
  }
}