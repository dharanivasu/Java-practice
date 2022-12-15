import java.util.*; 
class Product{
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
class ProductArray1 {
  public static void main(String args[]) {
    Scanner Sc=new Scanner(System.in);
    ArrayList<Product> list=new ArrayList();
    list.add(Sc.nextInt(),Sc.next(),Sc.nextInt(),Sc.nextInt());
    list.add(145,"Mango",23,200);
    list.add(123,"Banana",23,200);
    list.add(123,"Orange",23,200);
    list.addAll(list);
    for(Product p:list)
      {
        System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPqty()+" "+p.getPrice());
      }
                           }
  }