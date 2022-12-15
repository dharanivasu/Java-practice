import java.util.*;
class GenericMethod{
  public static void main(String argss[]){
 
    ArrayList<Integer> al=new ArrayList<Integer>();//Generic
    al.add(22);
    al.add(23);
    al.add(29);
    al.add(12);
   
    for(int i=0;i<al.size();i++){
      System.out.println(al.get(i));
    }
    for(int i:al){
      if(i%2==0){
        System.out.println(i);
      }
    }
 
    Iterator itr=al.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
     
   
    
  }
}

            