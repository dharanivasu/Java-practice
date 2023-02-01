import java.io.*;
import java.util.*;

/* class DataSet {
  public static void main(String args[]) {
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter File");
      String file = sc.next();
      File f1=new File(file);
      FileReader fr = new FileReader(f1);
      BufferedReader bf = new BufferedReader(fr);
      int rowcount = 0;
      String str = null;
      while ((str = bf.readLine()) != null) {
        if (rowcount <= 7) {
          System.out.println(str);
        } else {
          break;
        }
        rowcount++;
      }
      System.out.println("number of row" + rowcount);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}        */

class DataSet{
  public static void main(String args[]){
    try{
       String file = sc.next();
      File f1=new File(file);
      FileReader fr = new FileReader(f1);
      BufferedReader bf = new BufferedReader(fr);
    }
  }
}