class Rectangle{
  int length;
  int breadth;
  public Rectangle(int l,int b){
    length = l;
    breath = b;
  }
  void area(){
    System.out.println(length*breath);
  }
  void perimeter(){
    System.out.println(2*(length+breath));
  }
}
class Square extend Rectangle{
  
}