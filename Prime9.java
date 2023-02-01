//create an array variable store 10 integer values and display only prime numbers from that.

import java.util.*;
class Prime9{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the numbers");
    int n=Sc.nextInt();
    int count;
    int a[]=new int[n];
    System.out.println("prime number");
    for(int i=0;i<a.length;i++){
      count=0;
      for(int j=1;j<a[i];j++){
        if(a[i]%j==0){
          count++;
        }
      }
      if(count==2){
        System.out.println(a[i]);
      }
    }
  }
}