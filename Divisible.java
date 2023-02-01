import java.util.Scanner;
class Divisible{
      public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("divisible number");
        int num=Sc.nextInt();
        if(num %5==0){
           System.out.println("its divisible");
        }else{
          System.out.println("its not divisible");
        }
        
       
      }
}