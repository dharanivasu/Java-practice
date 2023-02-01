import java.util.Scanner;
class Unit{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("please enter the unit");
    int unit=Sc.nextInt();
    if(unit<50){
      enum=unit*0.50;
    else if(unit<100)
      enum=50*0.50+(unit-50)*0.75;
    else if(unit>100)
      enum=100*0.75+(unit-100)*1.20;
    else(unit>150)
      enum=100*1.20+(unit-100)*1.25;
    
      
    }
  }
}