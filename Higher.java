//Hiererchical  Inheritance
class Animal{
  String color;
  int no_legs;
  String bread;
  void eat(){
    System.out.println("eating");
  }  
  void sleep(){
    System.out.println("sleeping");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("Bow Bow......");
  }
  
}
class Cat extends Animal{
  String eyecolor;
  void meow(){
    System.out.println("Meow meow......");
  }

  void display(){
    System.out.println(color +" "+no_legs+" "+bread +" "+ eyecolor);  }
  
}

class Higher{
  public static void main(String args[]){
    Cat puppy=new Cat();
    puppy.color="black";
    puppy.no_legs=4;
    puppy.bread="jarman ";
    puppy.eyecolor="green";
    puppy.display();
    puppy.eat();
    puppy.sleep();
    puppy.meow();
  }
}