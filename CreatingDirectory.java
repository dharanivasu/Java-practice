/* 5. Write a Java program to accept directory name, file name from user. Do the following steps using File class.
   ==> Create directory with user entered directory name
   ==> Create file in given directory.
   ==> Accept one sentence about bitLabs and store in give file using FileOutputStream class.
   ==> Read data from given file and display read data on console using FileInputStream class.
*/

import java.io.*;
import java.util.*;

public class CreatingDirectory {
  public static void main(String[] args) {
    Scanner cc = new Scanner(System.in);

    
    System.out.print("Enter directory name: ");
    String directoryName = cc.nextLine();
    System.out.print("Enter file name: ");
    String fileName = cc.nextLine();

    try {
      
      File directory = new File(directoryName);
      if (!directory.exists()) {
        directory.mkdir();
      }

      
      File file = new File(directory, fileName);
      if (!file.exists()) {
        file.createNewFile();
      }

     
      FileOutputStream outputStream = new FileOutputStream(file);
      outputStream.write("bitLabs is a developing software developer learning center  that specializes in software development".getBytes());
      outputStream.close();

      
      FileInputStream inputStream = new FileInputStream(file);
      int ch;
      while ((ch = inputStream.read()) != -1) {
        System.out.print((char)ch);
      }
      inputStream.close();
    } catch (IOException e) {
      System.out.println("An I/O error occurred: " + e.getMessage());
    }
  }
}