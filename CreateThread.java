/*1. Write a program to create a new Thread by extending from Thread class, read data from studentdetails.txt 
     file using child Thread and read data from employee.txt file using main Thread. And print student details 
     first then employee details. Use join method to achieve this task. Before running this program create following files 
     • Create StudentDetails.txt file and enter 3 students’ information such as name, marks, college_name 
     • Create employee.txt and enter 3 employees’ information such as name, salary and department_name.*/
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
public class CreateThread  {

	public static void main(String args[]) throws InterruptedException {
    Thread t=new Thread(new Runnable(){
      public void run(){
        try{
          FileReader file1 = new FileReader("StudentDetails.txt"); 
    BufferedReader br = new BufferedReader(file1);
          String Student;
         while ((Student= br.readLine()) != null){
            System.out.println("Student :"+Student);
          }
          br.close();
        }catch(Exception e){
          System.out.println(e);
        }
      }
    });
	  t.start();
    t.join();
    try{
       FileReader file2 = new FileReader("employee.txt"); 
    BufferedReader br = new BufferedReader(file2);
      String emp;
      while((emp=br.readLine())!=null){
        System.out.println("employee :"+emp);
        
      }
      br.close();
    }catch(Exception e){
      System.out.println(e);
    }
	}
}
