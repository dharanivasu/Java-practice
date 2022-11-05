import java.util.Scanner;

class Home1{ 
public static void main(String args[]){
  float radius;
  double circum;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the radius of the circle:");
  radius=sc.nextFloat();
 circum=3.14*2*radius;  // 2 pi r
 System.out.println("circum of the circle is:"+circum);
} 
}