import java.util.*;
class Count{
  public void oddCount(int arr[]){
    int countodd=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        countodd++;
      }
    }
    System.out.println(countodd);
  }
  public void negativeCount(int arr[]){
    int countnative=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]<0){
        countnative++;
      }
    }
    System.out.println(countnative);
  }
  public void evenCount(int arr[]){
    int counteven=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        counteven++;
      }
    }
    System.out.println(counteven);
  }
  public static void main(String args[]){
      Count c=new Count();
    int array[]={2,4,6,8,1,3,7,-7,-5,-3};
    c.oddCount(array);
    c.evenCount(array);
    c.negativeCount(array);
  }
}