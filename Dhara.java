import java.util.Scanner;
class Dhara{
    public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the value of x and y");
    x = Sc.nextInt();
    y = Sc.nextInt();
    System.out.println("before swaping number");
    t=x;
    x=y;
    y=t;
    System.out.println("after swaping number");
}
}