/* 3. Write a JAVA program to input electricity unit charges and calculate the total     electricity bill according to the given condition: 
    For first 50 units Rs. 0.50/unit 
    For next 100 units Rs. 0.75/unit 
    For next 100 units Rs. 1.20/unit 
     For unit above 250 Rs. 1.50/unit 
     An additional surcharge of 20% is added to the bill */

import java.util.Scanner;

public class ElectricityBil {

	public static void main(String[] args) 
	{
		int Units;	
		double Total_Amount;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Units that you Consumed  : ");
		Units = sc.nextInt();
  
		Total_Amount = ElecBill(Units);
		System.out.println("\n Electricity Bill  =  " + Total_Amount);
	}
	public static double ElecBill(int Units)
	{
		double Amount, Sur_Charge, Total_Amount;
		if (Units < 50)
	  	{
	        Amount = Units * 0.50;
	  		Sur_Charge = 20;  	
	  	} 
	  	else if (Units <= 100)
	  	{
	  		Amount = 25 + ((Units - 50 ) * 0.75);
	  		Sur_Charge = 20; 	
	  	}
	  	else if (Units <= 100)
	  	{
	  		Amount = 25 + 37.5 + ((Units - 100 ) * 1.25);
	  		Sur_Charge = 20; 	
	  	}
       
	  	else 
	  	{
		   	Amount = 25 + 37.5 + 0 + ((Units - 100 ) * 1.50); 
		   	Sur_Charge = 20; 
		}
		
		Total_Amount = Amount + Sur_Charge;
		return Total_Amount;
	}
}