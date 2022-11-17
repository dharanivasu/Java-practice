class Print{
  void Print(int a,int b){
    System.out.println("Print is"+(a+b));
  }
  void Print(float a,int b,float c)
  {
    System.out.println("Print is"+(a+b+c));
  }
  void Print(float a,float b){
    System.out.println("Print is"+(a+b));
  }
}
class Day17NEv{
  public static void main(String args[]){
    Print P=new Print();
    P.Print(23,34);
    P.Print(2.34f,45,3.45f);
    P.Print(3.4f,4.56f);
  }
}
