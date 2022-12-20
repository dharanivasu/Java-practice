/* 1. Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following: 
    Percentage >= 90% : Grade A 
    Percentage >= 80% : Grade B 
    Percentage >= 70% : Grade C 
    Percentage >= 60% : Grade D 
    Percentage >= 40% : Grade E 
    Percentage < 40% : Grade F */

import java.util.*; 
class Marks
{
	public static void main(String args[])
	{
		

	int che,Phy, bio,maths, comp,total, percentage;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of Physics :- ");
	Phy =sc.nextInt();
	System.out.println("Enter the marks of Chemistry :- ");
	che =sc.nextInt();
	System.out.println("Enter the marks of Biology :- ");
	bio =sc.nextInt();
	System.out.println("Enter the marks of Mathematics :- "); 
	maths =sc.nextInt();
	System.out.println("Enter the marks of Computer :- ");
	comp =sc.nextInt();
	total = che+Phy+bio+maths+comp;
	percentage =total/5;
	System.out.println("The total marks your score is :-"+total);
	System.out.println("The percentage you scored is :- "+percentage);	
	if (percentage>=90)
	{
		System.out.println("Your grade is A :- "+percentage);
	}
	else if (percentage>=80)
	{
		System.out.println("Your grade is B :- "+percentage);
	}
	else if (percentage>=70)
	{
		System.out.println("Your grade is C :- "+percentage);
	}
	else if (percentage>=60)
	{
		System.out.println("Your grade is D :- "+percentage);
	}
	else if (percentage>=40)
	{
		System.out.println("Your grade is E:- "+percentage);
	}
	else if (percentage<40)
	{
		System.out.println("Your grade is F:- "+percentage);
	}
	else 
	{
		System.out.println("Fail");	
	}
	
}
}

