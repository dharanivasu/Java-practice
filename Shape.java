/*2.Create a class to print the area of a square and a rectangle. The class has two methods with the same name but 
different number of parameters. The method for printing area of rectangle has two parameters which are length and 
breadth respetively while the other method for printing area of square has one parameter which is side of square.*/
import java.util.*;
class Shapes{
  void rectangle(int l,int b){
    System.out.println("Area of rectangle"+(l*b));
  }
  void square(int a){
    System.out.println("Area of square"+(a*a));
  }
}
class Shape{
    public static void main(String args[]){
      Shapes s=new Shapes();
      s.rectangle  (34,55);
      s.square  (34);
    }
}