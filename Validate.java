
/* PU4	Validate file accessibility
pre-requisite	Files, Date Package , Control statements , OOPS - Core java

Use case description	A company want to send their tender quotation. For security reasons this file will be available to download for specified number of days only. Once the days crossed from the send date, file will not be available to download. Now build a logic to validate the expiry date to download the file.
*/
import java.io.*;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Validate {
  // main method
  public static void main(String[] args) throws ParseException {
    try {
      File f = new File("test.txt");
      if (f.createNewFile()) {
        System.out.println("File created: " + f.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (Exception e) {
      System.out.println(e);
    }

    // creating a new object of the class Date
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
    String str = formatter.format(date);
    System.out.print("Current date: " + str);
    System.out.println(date);

  }
}