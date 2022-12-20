// 14. Write a JAVA program to count number of digits in a number. 
import java.util.*;
public class CountNumberofDigits {
	public static void main(String[] args) {
		int n, Count=0;
		Scanner sc=new Scanner(System.in);		
		System.out.println(" Enter any Number: ");
		n = sc.nextInt();
		
		while(n > 0) {
			n = n / 10;
			Count = Count + 1; 
		}
		System.out.format(" Number of Digits in a Given Number = %d", Count);
	}
}