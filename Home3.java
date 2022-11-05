import java.util.Scanner;

public class Home3{
public static void main(String args[]){
  int maximum_marks, total_marks;
  Scanner sc=new Scanner(System.in);
  double maximumScore=348,totalScore=500;
  float Percentage;
  System.out.println("Enter the total marks:");
  total_marks=sc.nextInt();
  System.out.println("Enter maximum marks possible: ");
  maximum_marks=sc.nextInt();
  Percentage =(float)((maximumScore*100)/totalScore);
  System.out.println("Percentage = "+Percentage);
}
}