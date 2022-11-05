// What is a perfect number
// A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.

// Let's take the number 496 and heck it is a perfect number or not.

// First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248. Let's find the sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496). We observe that the sum of factors is equal to the number itself. Hence, the number 496 is a perfect number. Similarly, we can check other numbers also.

  
import java.util.*;
class Sample{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int i=1,sum=0;
    while(i<=n/2){
      if(n%i==0){
        sum=sum+i;
      }
      i++;
    }
    if(sum==n)
    {
      System.out.println("Perfect number");
    }
    else{
      System.out.println("Not perfect number");
    }
   
    }
  }