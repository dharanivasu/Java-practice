import java.util.*;
class Posneg{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter array ");
    int n=Sc.nextInt();
    int poscount=0,negcount=0;
    int a[][]=new int[n][n];
    System.out.println("enter element array");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++)
        a[i][j]=Sc.nextInt();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]<0){
          negcount++;
        }
        else{
          poscount++;
        }
      }
    }
    System.out.println("negitive number" +negcount);
    System.out.println("positive number" +poscount);
  }
}