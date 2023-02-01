// 19. Write a JAVA program to calculate product of digits of a number. 
import java.util.Scanner;

public class ProductOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, temp;
        int product = 1;

        
        System.out.print("Enter any number : ");
        num = scanner.nextInt();

        temp = num;

        while(temp != 0) {

            product = product * (temp % 10);

            
            temp = temp / 10;
        }

        System.out.println("\nProduct of all digits in " + num + " : " + product);
    }

}