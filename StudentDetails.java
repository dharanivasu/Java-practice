/* 5. Write a Java program to accept 5 students details such as name and marks and store in studentdetails.txt file in the below format.
     Ramu, 60
     Kumar,56
     Rakesh,89
     Suresh,66
    Read data from studentdetails.txt file and print Student name and marks who got top score. 
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.*;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("studentdetails.txt"))) {
            
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter name and marks of student " + i + ":");
                String name = sc.next();
                int marks = sc.nextInt();
                
                writer.write(name + ", " + marks);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        String topStudent = "";
        int topScore = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("studentdetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into name and marks
                String[] parts = line.split(", ");
                String name = parts[0];
                int marks = Integer.parseInt(parts[1]);
                if (marks > topScore) {
                    topScore = marks;
                    topStudent = name;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        System.out.println("Top student: " + topStudent + ", Marks: " + topScore);
    }
}