/* 3. Write a program to create 2 threads by extending from Thread class and create synchronized method called 
      withdraw(int amt) and access withdraw( ) from Thread1 and Thread 2.   */
class BankAcount{
  int balance=1000;
    synchronized void withdraw(int amount) {
        balance =balance - amount;
    }
}

public class Bank {
    public static void main(String args[]){
       BankAcount b=new BankAcount();
        Thread t1=new Thread(new Runnable(){
          public void run(){
            b.withdraw(50);
            System.out.println("Thread 1: withdraw 50");
          }
        });
      Thread t2=new Thread(new Runnable(){
           public void run() {
                b.withdraw(100);
                System.out.println("Thread 2: Withdrew 100");
            }
        });
          t1.start();
          t2.start();
    }
}
