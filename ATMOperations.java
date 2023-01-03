/* 2. Write a program to perform ATM operations such as deposit, withdraw and balance enquiry. Display list of options for user selection. 
   Accept option from the user and execute specified method. throw Exception when user trying to withdraw amount more than 3 times.
*/

import java.util.Scanner;

public class ATMOperations {
  static int balance = 20000; 
  static int withdrawCount =0; 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Balance Enquiry");
      System.out.println("4. Exit");
      System.out.print("Enter option: ");

      int option = sc.nextInt();

      switch (option) {
        case 1:
          deposit();
          break;
        case 2:
          try {
            withdraw();
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 3:
          balanceEnquiry();
          break;
        case 4:
          return;
        default:
          System.out.println("Invalid option");
          break;
      }
    }
  }

  // deposit money
  public static void deposit() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter amount to deposit: ");
    int amount = sc.nextInt();
    balance += amount;
    System.out.println("Deposited " + amount + ", current balance: " + balance);
  }

  //  withdraw money
  public static void withdraw() throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter amount to withdraw: ");
    int amount = sc.nextInt();
    if (amount > balance) {
      System.out.println("Insufficient balance");
      return;
    }
    balance -= amount;
    System.out.println("Withdrew " + amount + ", current balance: " + balance);
    withdrawCount++;
    if (withdrawCount > 3) {
      throw new Exception("Withdraw limit exceeded");
    }
  }

  //  display balance
  public static void balanceEnquiry() {
    System.out.println("Current balance: " + balance);
  }
}