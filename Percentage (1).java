import java.util.Scanner;
class Percentage{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter 1st sub mark");
    int sub1=Sc.nextInt();
    System.out.println("enter 2st sub mark");
     int sub2=Sc.nextInt();
     System.out.println("enter 3st sub mark");
     int sub3=Sc.nextInt();
     System.out.println("enter 4st sub mark");
     int sub4=Sc.nextInt();
     System.out.println("enter 5st sub mark");
     int sub5=Sc.nextInt();
    int total=sub1+sub2+sub3+sub4+sub5;
    int per=(total/100)*500;
    System.out.println("percentage is" +per+"");
    if(per>=90 && per<=100){
      System.out.println("grade A");
      else if(per>=80 && per<=90)
       System.out.println("grade B");
    else if(per>=70 && per<=80)
       System.out.println("grade C");
    else if(per>=60 && per<=70)
       System.out.println("grade D");
    else 
      System.out.println("fail");
    }
  }
}