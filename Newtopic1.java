class ThreadSample implements Runnable{
public void run(){//running
   //for(int i=1;i<=10;i++){
     try{
       int a=5,b=2,c;

       
       System.out.println("addition");
       c=a+b;
       Thread.sleep(1000);
       //waiting state
       c=a/b;
       System.out.println("division");
       Thread.sleep(5000);
     }
     catch(InterruptedException e){
       System.out.println(e);
     }
     
      System.out.println("child thread");
   }
   
  }
  

class Newtopic1{
public static void main(String args[]){
  ThreadSample t1=new ThreadSample();
  Thread obj=new Thread(t1);//new
  obj.start();//ready/runnable
 
  
}
  
}
 

