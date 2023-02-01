/*Create a class named Pizza that stores information about a single pizza. It should containthe following:  

1.Private  instance  variables  to  store  the  size  of  the  pizza  (either  small,  medium,or large), the  number of  cheese toppings, the number of pepperoni toppings, andthe number of ham toppings. 

2.Constructor(s) that set all of the instance variables.
3.Public methods to get and set the instance variables.
4.A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping  

 6.public method named getDescription( ) that returns a String containing the pizzasize, quantity of each topping.*/

import java.util.*;

class Pizza{

 Private int cheese;
 Private int pepperoni;
 Private int mushroom;
 Private  String  pizzaSize;

public Pizza(int cheese, int pepperoni,int mushroom,String pizzaSize){
  this.cheese=cheese;
  this.pepperoni=pepperoni;
  this.mushroom=mushroom;
  this.pizzaSize=pizzaSize;
  
  void setcheese(int cheese){
    this.cheese=cheese;
  }
  void setpepperoni(int pepperoni){
    this.pepperoni=pepperoni;
  }
  void setmushroom(int mushroom){
    this.mushroom=mushroom;
  }
  void setpizzaSize(String pizzaSize){
    this.pizzaSize=pizzaSize;
  }
  int getcheese(){
    return cheese;
  }
  int getpepperoni(){
     return pepperoni;
  }
  int getmushroom(){
    return mushroom;
  }
  String getpizzaSize(){
      return pizzaSize;
  }

}
public double CalcCost(){

       double bill = 0;

       if(pizzasize == "small")
       {
        System.out.println("$10 + $2 per topping");

       }
  else if(pizzasize == "medium"){

          System.out.println("$12 + $2 per topping");

       }
   else{

          System.out.println("$14 + $2 per topping ");

       }
public getDescription( ){
  
  System.out.println("Enter pizzaSize :"+pizzaSize);
  System.out.println("Number of cheese topping"+cheese);
  System.out.println("Number of pepperoni topping"+pepperoni);
  System.out.prinln("Number of mushroom topping"+mushroom);
}

}
public static void main(String args[]){
  
}

