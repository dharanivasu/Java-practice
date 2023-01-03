/* 5. Write a program create custom Exception to manage stock. Create OutOfStockException and throw this exception if user 
     entered stock is not present while purchase products. Create the following methods.
     ==> addStock(int qty)   : write code to add stock
     ==> purchase(int qty)   : write code to purchase products
     ==> diplayStock()       : write code to display available stock

  Display list of options to user before accept option from user, such as 
  1. addStock  
  2. purchaseProduct 
  3. displayStock
*/

import java.util.*;

 class StockManager {
    private int stock;

    public void addStock(int qty) {
        stock += qty;
    }

    public void purchase(int qty) throws OutOfStockException {
        if (qty > stock) {
            throw new OutOfStockException("Sorry, the requested quantity is not available in stock");
        }
        stock -= qty;
    }

    public void displayStock() {
        System.out.println("Current stock: " + stock);
    }
}

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

 class OutOfStock {
    public static void main(String[] args) {
        StockManager stockManager = new StockManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add stock");
            System.out.println("2. Purchase product");
            System.out.println("3. Display stock");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity to add: ");
                    int addQty = sc.nextInt();
                    stockManager.addStock(addQty);
                    break;
                case 2:
                    System.out.print("Enter quantity to purchase: ");
                    int purchaseQty = sc.nextInt();
                    try {
                        stockManager.purchase(purchaseQty);
                    } catch (OutOfStockException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    stockManager.displayStock();
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
