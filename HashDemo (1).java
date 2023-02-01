import java.util.*;
class HashDemo{
  public static void main(String args[]){
    HashMap<Integer,String> map=new HashMap<Integer,String>();
    map.put(1,"Apple");
    map.put(2,"Mango");
    map.put(3,"Banana");
    map.put(4,"Orange");
    
      for( Map.Entry m:map.entrySet()){
        System.out.println(m.getValue()+" "+m.getKey());
      }
   
  }
}