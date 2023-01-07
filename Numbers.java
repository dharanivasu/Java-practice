// remove duplicate numbers 1,11,11,12,13,13,18,20,20
import java.util.*;
class Numbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    //numbers.add(1);
    //numbers.add(11);
    //numbers.add(11);
   // numbers.add(12);
    //numbers.add(13);
    //numbers.add(13);
   // numbers.add(18);
   // numbers.add(20);
   // numbers.add(20);
      System.out.println("enter the number of size:");
      int num=sc.nextInt();
    System.out.println("Enter the value :");
    for(int i=0;i<num;i++){
      
      numbers.add(sc.nextInt());
    }
    Set<Integer> set=new TreeSet<>(numbers);
    List<Integer> uniquenumbers=new ArrayList(set);
    System.out.println(uniquenumbers);
  }
}
