import java.util.*;
class Product1{
  int id;
  String name;
  int price;
  int quantity;

  Product1(int id,String name, int price,int quantity){
    this.id=id;
    this.name=name;
    this.price=price;
    this.quantity=quantity;
    
  }
}
interface ProductData{
  public void insert(ArrayList<Product1> p);
  public void display(ArrayList<Product1> p);
  public void update(ArrayList<Product1> p, int id);
  public void search(ArrayList<Product1> p, int id);
  public void delete(ArrayList<Product1> p, int id);
}
class ProductImpl implements ProductData{
   public void insert(ArrayList<Product> p){
     Scanner sc=new Scanner(System.in);
     p.add(new Product1(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt()));
     p.add(new Product1(sc.nextInt(),sc.nextLine(),sc.nextInt(),sc.nextInt()));
     if(p.isEmpty()){
         System.out.println("not inserted");
     }
     else{
       System.out.println("inserted");
     }
   }
  
  
   public void display(ArrayList<Product> p){
     for(Product obj:p){
       System.out.println(obj.id+" "+obj.name+" "+obj.price+" "+obj.quantity);
     }
   }

public void update(ArrayList<Product> p, int id){
  for(Product obj:a){
  if(obj.id==id){
    obj.name="lg";
  }
  }
  System.out.println(obj.name);
}

public void search(ArrayList<Product> p, int id){
  for(Product obj:p){
    if(obj.id==id){
       System.out.println(obj.id+" "+obj.name+" "+obj.price+" "+obj.quantity);
    }
  }
}
public void delete(ArrayList<Product> p, int id){
    for(Product obj:p){
      if(obj.id==id){
        p.remove("iphone");
      }
      if(obj.name=="iphone"){
  System.out.println("not deleted");
      }
      else{
        System.out.println("deleted successfully");
      }
    }
  }
    }
class Product{
  public static void main(String args[]){
    ProductData p=new ProductImpl();
    ArrayList<Product1> list=new ArrayList <Product1>();
    p.insert(list);
    p.display(list);
    p.update(list,1);
    p.search(list,1);
    p.delete(list,1);
  }
}