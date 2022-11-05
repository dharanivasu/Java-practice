import java.util.*;
class Dhara6{
  public static void main(String args[])
  { 
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=Sc.nextInt();
    int rem,prod=1;
    int last_digit=n%10;
    while(n>9)
      {
        n=n/10;
      }
    int first_number=n;
    int sum=first_number+last_digit;
    System.out.println(sum);
    }
}