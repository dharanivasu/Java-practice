/* 2. Write a program to create custom exception to perform deposit and withdraw options. 
      Create InvalidAmountException and throw this exception whenever user trying to deposit or withdraw invalid amount. 
      Deposit and withdraw amount should be multiples of 100 and it should be positive value.
*/

import java.util.Scanner;

 class CustomException1 {
    private int balance;

    public CustomException1(int initialBalance) {
        balance = initialBalance;
    }

    public void deposit(int amount) throws InvalidAmountException {
        if (amount % 100 != 0 || amount < 0) {
            throw new InvalidAmountException("Invalid deposit amount: must be a multiple of 100 and positive");
        }
        balance += amount;
    }

    public void withdraw(int amount) throws InvalidAmountException {
        if (amount % 100 != 0 || amount < 0) {
            throw new InvalidAmountException("Invalid withdraw amount: must be a multiple of 100 and positive");
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        CustomException1 account = new CustomException1(1000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = sc.nextInt();
                    try {
                        account.deposit(depositAmount);
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    int withdrawAmount = sc.nextInt();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Your balance is: " + account.getBalance());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
