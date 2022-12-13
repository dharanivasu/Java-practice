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
  
}

class Emil {
  public static void main(String args[]) {
  Product p1=new Product();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter product 1 details");
    p1.setPid(sc.nextInt());
    p1.setPname(sc.next());
    p1.setPqty(sc.nextInt());
    p1.setPrice(sc.nextInt());
    System.out.print(p1.getPid()+" "+p1.getPname()+" "+p1.getPqty()+" "+p1.getPrice());
    
  }
}