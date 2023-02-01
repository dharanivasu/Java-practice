import java.util.Scanner;
 
 class SwapWithout {
 
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
    System.out.println("Enter x:");
    int x = scanner.nextInt();
 
    System.out.println("Enter y:");
    int y = scanner.nextInt();
 
    System.out.println("Before swap");
 
    x = x + y;
    y = x - y;
    x = x - y;
 
    System.out.println("After swap");
      }
}