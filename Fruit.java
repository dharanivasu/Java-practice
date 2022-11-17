import java.util.*;
class Fruit{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    int a[]={"Orange,mango,banana,apple,watermelon"};
    System.out.println("Enter the fruit name");
    String name=Sc.next();
    int count=0;
    
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    if(a[i].equals(name)){
      count++;
      break;
    }
  }
  
  if(count==1){
     System.out.println("fruit is found");
  }
  else{
    System.out.println("Not found");
}
}