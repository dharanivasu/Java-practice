 import java.util.*;
class Puzzlecount{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of rows and columns");
    int n=sc.nextInt();
    int count=0;
    int a[][]=new int[n][n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]<10){
          count++;
          
        }
      }
    }
    System.out.println(count);
  }
}


    
    