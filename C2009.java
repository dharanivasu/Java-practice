//create a class product,product id,product name,product cost,product quantityare the attributes ..default costructoe and parameterized constructor attributes should be declared as private and create getters and setters and display the 5 products information..//

import java.util.*;
class Product{
  Private int Id;
  private String name;
  private int cost;
  private int quantity;

  Product(){
    
  }

   public void setId(int id){
    this.id=id;
  }
   public void setname(String name){
    this.name=name;
  }
   public void setcost(int cost){
    this.cost=cost;
  }
   public void setquantity(int quantity){
    this.quantity=quantity;
  }

   public int getId(){
    return id;
  }
   public String getname(){
    return name;
  }
   public int getcost(){
    return cost;
  }
   public int getquantity(){
    return quantity;
  }
}

  class Products{
  public static void main(String args[]){
    Scanner S=new Scanner(System.in);
  Products p=new Products();