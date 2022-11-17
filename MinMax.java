import java.util.*;
 class MinMax{
  public static void main(String[] args) {
     Scanner Sc=new Scanner(System.in);
     int a[]=new int[10];
     System.out.println("Enter elements in array");
       int min=Sc.nextInt();
       int max=Sc.nextInt();
       for(int i=0;i<=9;i++)
       {
         a[i]=Sc.nextInt();
         if(a[i]<min)
           {
           min=a[i];
           }
         if(a[i]>max)
         {
           max=a[i];
         }
       }
       System.out.println("the different between"+min+,+max+);
      
       
       
  }
}