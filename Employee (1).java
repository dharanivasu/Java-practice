class Employee {
  private int eid;
  private String ename;
  private int amtperhr;
 
  Employee() {
 
  }
 
  Employee(int eid, String ename, int amtperhr) {
    this.eid = eid;
    this.ename = ename;
    this.amtperhr = amtperhr;
  }
 
  public void setEid(int eid) {
    this.eid = eid;
  }
 
  public void setEname(String ename) {
    this.ename = ename;
  }
 
  public void setAmtperhr(int amtperhr) {
    this.amtperhr = amtperhr;
  }
 
  public int getEid() {
    return eid;
  }
 
  public String getEname() {
    return ename;
  }
 
  public int getAmtperhr() {
    return amtperhr;
  }
 
  public void displayAmount() {
    System.out.println(amtperhr);
  }
}
 
class Contractor extends Employee {
 
  int no_of_work_hrs;
 
  Contractor(int eid, String ename, int amtperhr, int no_of_work_hrs) {
    super(eid, ename, amtperhr);
    this.no_of_work_hrs = no_of_work_hrs;
  }
 
  public void calculateSalary() {
    System.out.println(no_of_work_hrs * getAmtperhr());
  }
}
 
class Fulltime extends Employee {
 
  Fulltime(int eid, String ename, int amtperhr) {
    super(eid, ename, amtperhr);
  }
 
  public void calculateSalary() {
    int sal = 8 * getAmtperhr();
    System.out.println(sal);
  }
}
 
class Home {
  public static void main(String args[]) {
    Employee e = new Employee(12, "lalitha", 200);
    e.displayAmount();
    Contractor c = new Contractor(e.getEid(), e.getEname(), e.getAmtperhr(), 4);
    Fulltime f = new Fulltime(e.getEid(), e.getEname(), e.getAmtperhr());
    f.calculateSalary();
  }
 
}