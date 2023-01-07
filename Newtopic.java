class ThreadSample implements Runnable{
public void run(){
   for(int i=1;i<=5;i++){
      System.out.println("child thread");
   }
   
  }
  
}
class Newtopic{
public static void main(String args[]){
  ThreadSample ts=new ThreadSample();
  Thread obj=new Thread(ts);
  obj.start();
  System.out.println(obj.getName());
  System.out.println("Main thread");
  
}
  
}