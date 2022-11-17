class Shape{
  void print_Shape(){
    System.out.println("This is This is shape");
  }
}
class Rectangle3 extends Shape{
  void print_Rectangle(){
   System.out.println("This is rectangluar shape");
}
}
class Circle extends Shape{
  void print_Circle(){
  System.out.println("This is circular shape");
}
}
class Square1 extends Rectangle3{
  void print(){
    System.out.println("Square is a rectangle");
}
}
class Amsmeth{
  public static void main(String args[]){
    Square1 s=new Square1();
    s.print_Shape();
    s.print_Rectangle();
    s.print();
  }
}