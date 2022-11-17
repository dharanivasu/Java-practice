import java.util.*;
class Rowcol{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter row");
    int row=Sc.nextInt();
    System.out.println("enter col");
    int col=Sc.nextInt();
    int a[][]=new int[row][col];
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        a[i][j] = Sc.nextInt();
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print(a[i][j]+ " ");
      }
      System.out.println();
    }
  }
}