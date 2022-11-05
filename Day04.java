import java.util.*;
class Day04{
public static void main(String args[]){
  Scanner Sc=new Scanner(System.in);
  char ch;
  System.out.println("Enter the pin number");
  int num=Sc.nextInt();
  int amount=0, count=0;
 do{
   while(p>0){
     count++;
     pin=pin/10;
   }
   System.out.println(count);
   if(count==4)
     System.out.println("select amount\n 1. withdraw\n 2.deposit\n 3.check balance\n 4.exit");
   System.out.println("enter the option");
   int n = sc.nextInt();
        switch (n) {
          case 1:
            System.out.println("Enter the  amount to withdraw");
            int a = sc.nextInt();
            amount = amount - a;
            System.out.println("withdraw succefully");
            break;
          case 2:
            System.out.println("Enter the amount  to deposit/n deposit= ");
            int da = sc.nextInt();
            amount = amount + da;
            break;
          case 3:
            System.out.println("the amount is " + amount);
            break;
          case 4:
            System.out.println("Thank you for visiting");
            break;
          default:
            System.out.println("invalid number try again");

        
      
      System.out.println("Do u want to search one more home");
      ch = sc.next().charAt(0);
    } while (ch=='y');
     }
 }
              
  



  
   