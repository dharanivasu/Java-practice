/* 3. Write a Java program to read data from input file and convert all the characters into swap case then 
      write into output file using FileInputStream and FileOutputStream classes.

      Sample Input: Create text file and write some data to the file. 
      Sample Data: "Hi, This is Sample data"
      Expected Output: hI,tHIS IS sAMPLE DATA

*/

import java.io.*;

public class ConvertIntoSwapCase {
  public static void main(String args[]) {
    try {
      
      FileInputStream inputFile = new FileInputStream("input.txt");
      FileOutputStream outputFile = new FileOutputStream("output.txt");

      
      int cha;
      while ((cha = inputFile.read()) != -1) {
        
        outputFile.write(Character.isLowerCase(cha) ? Character.toUpperCase(cha) : Character.toLowerCase(cha));
      }

      
      inputFile.close();
      outputFile.close();
    } catch (IOException e) {
      System.out.println("An I/O error occurred: " + e.getMessage());
    }
  }
}