//multiple methods have same name with different parameters(Method overloading)

class Addition{

  void sum(int a,int b){
    System.out.println("Sum is "+(a+b));
  }
  
  void sum(int a,int b,int c){
     System.out.println("Sum is "+(a+b+c));
  }
   void sum(int a,float b){
     System.out.println("Sum is "+(a+b));
  }
  void sum(float a,float b){
     System.out.println("Sum is "+(a+b));
  }
   void sum(float a,int b){
     System.out.println("Sum is "+(a+b));
  }
}
class Day17Nev{
  public static void main(String args[]){
  Addition add=new Addition();
    add.sum(23,27);
    add.sum(1,2,3);
    add.sum(12,34.5f);
    add.sum(34.5f,12.3f);
    add.sum(23.5f,12);
  }
}