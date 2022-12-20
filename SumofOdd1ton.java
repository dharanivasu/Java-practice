// 12. Write a JAVA program to find sum of all odd numbers between 1 to n.
import java.util.*;
 
public class SumofOdd1ton {
    public static void main(String args[]) {
        int N, i, sum = 0;
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        N = sc.nextInt();
 
        for(i = 0; i <= N; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between 1 to "
            + N + " = " + sum);
    }
}