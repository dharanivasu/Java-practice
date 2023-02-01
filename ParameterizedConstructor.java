/* 5. Write a Java program to demonstrate that objects created inside a method will becomes eligible for gc after method execution terminate. 
     Use parameterized constructor to receive the objects.*/

public class ParameterizedConstructor {
  Object object;

  ParameterizedConstructor(Object obj) {
    this.object = obj;
  }

  public void display() {
    System.out.println("Object created");
  }

  public void finalize() {
    System.out.println("Object got garbage collected");
  }

  public static void main(String args[]) {
    Object ob = new Object();
    ParameterizedConstructor paracon = new ParameterizedConstructor(ob);
    paracon.display();
    // the object is no longer being used, it is garbage collected
    paracon = null;
    System.gc();
  }
}