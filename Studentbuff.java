/* 1. Write a Java program to read 5 students information like Student_id, student_name, marks and city and store in Students.txt file using FileWriter class. if data is stored successfully read the five students data and display it on console.
Note: Append the data if Students.txt file is not empty.
  */

import java.io.*;
class Studentbuff{
  public static void main(String args[]) throws IOException{
    BufferedWriter br=new BufferedWriter(new FileWriter("studentdata.txt"));
    br.write("student-id,student-name,student-marks,city");
    //br.newLine();
    br.write("123,abcd,367,Chennai");
    br.newLine();
    br.append("456,efgh,710,T-Nagar");
    //br.newLine();
    br.close();
    BufferedReader rd=new BufferedReader(new FileReader("studentdata.txt"));
    String str;
    while((str=rd.readLine())!=null){
    //  for(int i=0;i<str.length();i++){
      String[] words=str.split(",");
     // for(int i=1;i<words.length;i++){
        System.out.println("student-id:"+words[0]);
        System.out.println("Student-name:"+words[1]);
        System.out.println("Student-marks:"+words[2]);
        System.out.println("city:"+words[3]);
      //}
    }
  }
}
 