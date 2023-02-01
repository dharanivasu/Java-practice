import java.util.*;
class day{
  private int salary;
  private int bill1;
  private int bill2;
  private int bill3;
  day(int bill1,int bill2,int bill3){
    this.salary=salary;
    this.bill1=bill1;
    this.bill2=bill2;
    this.bill3=bill3;
    
  }
  public void setsalary(int salary){
    this.salary=salary;
  }
   public void setBill1(int bill1){
    this.bill1=bill1;
  }
   public void setBill2(int bill2){
    this.bill2=bill2;
  }
   public void setBill3(int bill3){
    this.bill3=bill3;
  }
  public int  getsalary(){
    return salary;
  }
  public int bill1(){
    return bill1;
  }
  public int bill2(){
    return bill2;
  }
  public int bill3(){
    return bill3;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter salary");
    int salary=sc.nextInt();
    System.out.println("Enter Bill1 :");
   // Employeesalary empsal=new Employeesalary(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
    int total=Bill1+Bill2+Bill3/Salary*100;
    System.out.println(percentage+ "")
  }
}
