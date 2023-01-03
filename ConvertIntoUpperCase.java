/* 2. Write a Java program to read data from input file and convert into uppercase then write data into 
      output file using FileInputStream and FileOutputStream classes. Handle IOException while reading and writing data.

      Sample Input:Create text file and write some data to the file.
      Sample Data: "Hi, this is Sample data"

      Expected Output: HI, THIS IS SAMPLE DATA
*/
 
import java.io.*;

public class ConvertIntoUpperCase {
  public static void main(String[] args) {
    try {
      
      FileInputStream inputFile = new FileInputStream("input.txt");
      FileOutputStream outputFile = new FileOutputStream("output.txt");

      
      int cha;
      while ((cha = inputFile.read()) != -1) {
        
        outputFile.write(Character.toUpperCase(cha));
      }

      
      inputFile.close();
      outputFile.close();
    } catch (IOException e) {
      System.out.println("An I/O error occurred: " + e.getMessage());
    }
  }
}


