/* 2. Write a program to create a Thread by extending from Thread class. Override run() method and in run() 
      method accept number of seconds from user and display countdown time. 
      
      Sample Input: 
      Enter Number of seconds: 60

      Expected Output:
      59 seconds to go..
      58 seconds to go..
      57 seconds to go..
      56 seconds to go..
*/
import java.util.*;
import java.io.*;
 class CountdownTimer extends Thread {
     int seconds;

 CountdownTimer(int seconds) {
        this.seconds = seconds;
    }
  public void run(){
     while(seconds>0){
       System.out.println(seconds+"seconds to go..");
       seconds--;
       try{
         Thread.sleep(100);
       } catch (InterruptedException e) {
                e.printStackTrace();
            }
     }
   }
 }
   class OverrideThread  {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number of seconds:");
    int sec=sc.nextInt();
    CountdownTimer time = new CountdownTimer(sec);
        time.start();
  }
}

