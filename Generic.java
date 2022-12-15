import java.util.*;
class Generic{
  public static void main(String argss[]){
 
    ArrayList<String> al=new ArrayList<String>();//Generic
    al.add("apple");
    al.add("orange");
    al.add("berry");
    al.add("banana");
    for(String i:al){
          System.out.println(i);
    }
    for(int i=0;i<al.size();i++){
      System.out.println(al.get(i));
    }
 
    Iterator itr=al.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
     
   
    
  }
}