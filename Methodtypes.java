import java.util.*;
class Methodtypes{
  public static void main(String argss[]){
 
    ArrayList<String> al=new ArrayList<String>();//Generic
    al.add("abc");
    al.add("def");
    al.add("ghi");
    al.add("jkl");
    al.add("mno");
    
    ArrayList<String> al1=new ArrayList<String>();
    al1.addAll(al);
    
    System.out.println(al.get(1));
    System.out.println(al.isEmpty());
    Object a[]=al.toArray();
    for(int i=0;i<a.length;i++){
   
      System.out.println(a[i]);
    }
    System.out.println(al.contains("dharu"));
   //al.replaceAll("$");
    al.set(1,"dharu");
     System.out.println(al);
  System.out.println(al.subList(2,4));
    
  }
}