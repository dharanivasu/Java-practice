import java.util.*;
class Product implements comparable<Product>{
  int id;
  String name;
  int quantity;

  Product(int id,String name,int quantity){
    this.id=id;
    this.name=name;
    this.quantity=quantity;
  }
  public int CompareTo(Product p1){
    if(id==p1.id){
      return 0;
    }
    else if(id>p1.id){
      return 1;
    }
    else{
      return -1;
    }
  }
}
class ProductShort{
  public static void main(String agrs[]){
    ArrayList<Product> list=new ArrayList<Product>();
      
    list.add(new Product(1,"bag",2));
    list.add(new Product(2,"bag",3));
    list.add(new Product(3,"bag",4));
    list.add(new Product(4,"bag",5));
      Collections.sort(list);
    
      for(Product obj:list){
      System.out.println(obj.id+" "+obj.name+" "+obj.quantity);
      }
    
  }
}