/* 1. Write a Java program to get a list of all files/directory names from the given path using File class object.*/

import java.io.File;

public class FilesDirectory {
  public static void main(String[] args) {
    // Specify the path to the directory
    File directory = new File("Java");

    // Get a list of all the files and directories in the directory
    File[] files = directory.listFiles();

    // Iterate over the list of files and directories
    for (File file : files) {
      // Print the name of each file or directory
      System.out.println(file.getName());
    }
  }
}





