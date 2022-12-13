import java.util.*;
 class NiceNumber{
    public static int findType (int x)
    { 
        int count=0;
    for(int i=2;i<=x/2;i++)
    {
        if(x%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        return 1;
    }
    else 
    
        return 0;
 
}
}
public class Nice {
   public static void main(final String args[]) {
       Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     final int result= NumberType.findType(num);
     if(result==1){
       System.out.println("Nice number");
     }
     else{
         System.out.println("Not Nice number");
     }
   }
}