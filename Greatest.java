import java.util.Scanner;
class Greatest{
     public static void main(String args[]){
       Scanner Sc=new Scanner(System.in);
       int a=Sc.nextInt();
       int b=Sc.nextInt();
       if(a>b){
         System.out.println("a is greatest");
       }else{
         System.out.println("b is greatest");
       }
     }
}