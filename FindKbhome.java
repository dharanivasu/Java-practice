import java.util.Scanner;
class Findkbhome{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Choose the location");
    System.out.println("locations are: \n1.Bay area-north\n2.Bay Area-South\n3.Central valley");
   char ch;
    do{
      System.out.println("Enter the location");
      int location=Sc.nextInt();
      if(location==1||2||3){
        System.out.println("Enter the price");
        int price=Sc.nextInt();
        System.out.println("Enter the No.of bed");
        int bed=Sc.nextInt();
        System.out.println("Enter the squarefeet ");
        int squarefeet=Sc.nextInt();
        if(price==100&&bed==2&&squarefeet==1000){
          System.out.println("3 homes are matched");
        }
          
    else if(price==200&&bed==3&&squarefeet==2000){
          System.out.println("2 homes are matched");
          }
          else if 
        {
            System.out.println("No homes matched");
          }
        else {
            System.out.println("No location found");
      }
       System.out.println("Do you want search again \n 1. Type y for search again \n 2. Type n for Exit");
      char ch=Sc.next().charAt(0);
        }
      
      }while(ch=='y');
      
    }
           }
    
  
