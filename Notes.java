import java.util.Scanner;
class Notes{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    
    int amount=Sc.nextInt();
    int fcount=amount/500;
    amount=amount-fcount*500;
    System.out.println("500 notes are:" +fcount);
    int tcount=amount/200;
    amount=amount-tcount*200;
    System.out.println("200 notes are:" +tcount);
    int hcount=amount/100;
    amount=amount-hcount*100;
    System.out.println("100 notes are:" +hcount);
  }
}

class Sample {
  public static void main(String args[]) {
    int a=50,b=10,c=30;
    if(a>b){
      if(a>c){
        System.out.println("a is big");
      }
      else
      {
        System.out.println("c is big");
      }
    }
    else if(b>c){
      System.out.println("b is greater");
      
    }
    
  }
}

10th class
  your offer you something based on your final marks

  90: excellent,i will buy for bike
  80:
very good, I will buy for you mobile
  70:
good,cycle
  60:
worst,belt

  father:how much grade you are expecting in final exam
  son: dad i got 90 per


