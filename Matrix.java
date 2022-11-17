import java.util.*;
class Matrix{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter row size");
    int row=sc.nextInt();
    System.out.println("enter col size");
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    //Reading
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        a[i][j]=sc.nextInt();
      }
    }
    //display
    
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        if(a[i][j]<=5)
       System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    }
    }