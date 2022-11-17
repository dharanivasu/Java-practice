import java.util.*;
class Max{
  public static void main(String args[]){
    int a[]={324,121,454,456,678,153,371,6,28};
    int Max=a[0],index=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>Max){
        Max=a[i];
        index=i;
      }
    }
    System.out.println("Max element is "+Max+" found at "+ (index)+"th index" );
  }
}