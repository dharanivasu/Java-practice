import java.util.Scanner;

 class Aged {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
    System.out.println("Enter your age");
    int age=Sc.nextInt();
		if(age<15 || age>60) {
			System.out.println("Not Allowed");
		}
		else
			System.out.println("Allowed");
	}

}