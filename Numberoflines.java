/*2. Write a Java program to read data from data.txt file using BufferedReader class and find following
-->Number of lines
--> Number of words
--> Number of characters (including spaces)
--> Number of characters (excluding spaces) */

import java.io.*;
class Numberoflines{
  public static void main(String args[]){
    int count=0;
    BufferedReader b=new BufferedReader(new FileReader("studentdata.txt"));
    String str;
    while((str=b.readLine())!=null){
      count++;
    }
    System.out.println("number of lines :"+count);
  }
}