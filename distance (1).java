import java.util.Scanner;
class distance{
      public static void main(String args[]){
        int x1,x2,y1,y2;
        Scanner Sc=new Scanner(System.in);
          System.out.println("Enter a value of x1");
          x1=Sc.nextInt();
          System.out.println("Enter a value of y1");
          y1=Sc.nextInt();
          System.out.println("Enter a value of x2");
          x2=Sc.nextInt();
          System.out.println("Enter a value of y2");
          y2=Sc.nextInt();
          
       double result=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("the distance between two points is"+result);
        
        
          
      }
}