import java.util.*;
class Friutes1{
  private int id;
  private String name;
  private  int quantity;
  private int price;

  public void setId(int id){
    this.id=id;
  }
  public void setname(String name){
    this.name=name;
  }
  public void setquantity(int quantity){
    this.quantity=quantity;
  }
  public void setprice(int price){
    this.price=price;
  }
  public int getId(){
    return id;
  }
   public String getname(){
    return name;
  }
   public int getquantity(){
    return quantity;
  }
   public int getprice(){
    return price;
  }
  
}
class Friutes{
  public static void main(String args[]){
    Scanner S=new Scanner(System.in);
  Fruites F=new Fruites();
    String s=S.nextLine();
    String s1[]=new String[4];
    s1=s.split(",");
   F.setId(Integer.parseInt(s1[0]));
    F.setname(s1[1]);
    F.setquantity(Integer.parseInt(s1[2]));
    F.setprice(Integer.parseInt(s1[3]));

    System.out.println("Id is="+ F.getId());
    System.out.println("name is="+ F.getname());
    System.out.println("quantity is="+ F.getquantity());
    System.out.println("price is="+ F.getprice());
    
  }
}