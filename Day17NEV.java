/* 2.Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).*/
class Print{
  void Print(int n,char c){
    System.out.println("Print is "+(n+c));
  }
  void Print(char c,int n){
    System.out.println("Print is "+(c+n));
  }
}
class Day17NEV{
  public static void main(String args[]){
    Print P=new Print();
    P.Print(34,d);
    P.Print(c,56);
  }
}