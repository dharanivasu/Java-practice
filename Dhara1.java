import java.util.*;
class Dhara1{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    int i,count, sum=0;
    System.out.println("Enter range");
    int n=sc.nextInt();
    for(int num=1;num<=n;num++){
      count=0;
          for(int j=1;j<=num;j++)
      {
        if(num%j==0)
        {
         count++;
        }
      }
    if(count==2){
      sum=sum+num;
      System.out.println(sum);
    }
      
    }
    }
  }