import java.util.*;
class Demo{
  private int pid;//instance 
  private String pname;
  private int pqty;
  private int price;
  //setters and getters
  //assign the values to private variables
//this is call the current class instance variable
  void setPid(int pid){//local variable
   this.pid=pid;
  }
  void setPname(String pname){
    this.pname=pname;
  }
  void setPqty(int pqty){
    this.pqty=pqty;
  }
  void setPrice(int price){
    this.price=price;
  }
    //getters
  int getPid(){
    return this.pid;
  }
  String getPname(){
    return this.pname;
  }
  int getPqty(){
    return this.pqty;
  }
  int getPrice(){
    return this.price;
  }
  //constructor name should be same as class name
  //we should not declare constructor with any keyords like final static abstract
  //It looks like a method but it doest not return any value
 
  Product(){
    System.out.println("Constructor called");
  }
  Product(int pid,String pname,int pqty,int price){
    this.pid=pid;
    this.pname=pname;
    this.pqty=pqty;
    this.price=price;
  }
  Product(int pid){
    this.pid=pid;
  }
  Product(int pid,String pname){
    this.pid=pid;
    this.pname=pname;
  }
  
}
 
class Product {
  public static void main(String args[]) {
  Product p[]=new Product[2];
    Scanner sc=new Scanner(System.in);
 
    for(int i=0;i<2;i++){
      System.out.println("Enter product  details");
      p[i]=new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
    //   System.out.println("Enter product  details");
    // p[i].setPid(sc.nextInt());
    // p[i].setPname(sc.next());
    // p[i].setPqty(sc.nextInt());
    // p[i].setPrice(sc.nextInt());
    System.out.print(p[i].getPid()+" "+p[i].getPname()+" "+p[i].getPqty()+" "+p[i].getPrice());
    
    }
    
  }
}
 
