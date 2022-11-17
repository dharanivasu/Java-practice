/* 3.Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of rectangle has two parameters which are length and breadth respetively while the other method for printing area of square has one parameter which is side of square.*/
class Area{
  void Area(float a){
    System.out.println("Area of square is"+(a*a));
  }
  void Area(int l,int b){
    System.out.println("Area of rectangle is"+(l*b));
  }
}
class Day17NEV1{
  public static void main(String args[]){
    Area A=new Area();
    A.Area(2.34f);
    A.Area(34,56);
  }
}
