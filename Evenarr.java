import java.util.*;
class Evenarr{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    int a[]=new int[5];
  
    System.out.println("Enter arrays");
    
    for(int i=0;i<a.length;i++){
       a[]=Sc.nextInt();
    }
      for(int j=0;j<a.length;j++){
        if(a[i]%2==0){
          System.out.println(a[i]);
        }
      }
    }
  }
