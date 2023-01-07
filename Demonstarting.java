/* 4. a java Program that demonstrating the garbage collection by calling System.gc().*/


/*
public class Demonstarting {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10000; i++) {
            Object obj = new Object();
        }

        System.out.println("Done creating objects");

        
        System.gc();

        System.out.println("Done calling System.gc()");
    }
}*/



public class Demonstarting {
 
    public static void main(String args[]) {
  Demonstarting std=new Demonstarting();
     // System.out.println(std);
      std=null;
     
   System.gc();  
    
    }
   public void finalize(){
     System.out.println("garbage collected");
     
   }
}