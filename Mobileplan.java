import java.util.*;
class MobilePlan{
  public void planDet(int day,int eve, int week){
    int cost1,cost2=0;
    if(day>100){
      cost1=(day-100)*0.25+(eve*0.15)+(week*0.20);
    }
    else{
      cost1=(eve*0.15)+(week*0.20);
    }
    if(day>250){
     cost2=(day-250)*0.45+(eve*0.35)+(week*0.25);
    }
    else{
      cost2=(eve*0.35)+(week*0.25);
    }
    if((int)cost1>(int)cost2)
  }
}
class Mobileplan{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the daytime min");
    int day=Sc.nextInt();
    System.out.println("")
  }
}