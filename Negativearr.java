import java.util.*;
class Negativearr{
	
	public static void main(String args[]) {
		int i = 0, count = 0;
		int a[] = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
		
		while(i < a.length) 
		{
			if(a[i] < 0) {
				count++;
			}
			i++;
		}
		System.out.println("\nThe Total Number of Negative Array Items = " + count);
	}
}