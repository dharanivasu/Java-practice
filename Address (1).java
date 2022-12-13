/*When we get the address from the user some have entered in comma separated format rather than in specific fields. So we need a program that can split the address into appropriate fields and create an object from it. Let's write it and display the address that has been split in tabular form.
Create a class Address with following private attributes

Attributes
DataType

userId
Integer

street
String

city
String

state
String

Include appropriate getters and setters
Create default constructor and a parameterized constructor with arguments in order Address(Integer userId, String street, String city, String state).
 
Create a driver class named Main to test the above class.
 
Display the address in a tabular format using format method - System.out.format("%-15s %-15s %-15s %s\n", "User ID","Street","City","State").
 */


import java.util.*;
class Adress{
  private int userId;
  private String street;
  private String city;
  private String state;

  public void setuserId(int userId){
    this.userId=userId;
  }
  public void setstreet(String street){
    this.street=street;
  }
  public void setcity(String city){
    this.city=city;
  }
  public void setstate(String state){
    this.state=state;
  }
  public int getuserId(){
    return userId;
  }
   public String getstreet(){
    return street;
  }
   public String getcity(){
    return city;
  }
   public String getstate(){
    return state;
  }
  Adress(int userId,String street,String city,String state){
    this.userId=userId;
    this.street=street;
    this.city=city;
    this.state=state;
  }
}
class Address{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the address");
    String S=Sc.nextLine();
    String s1[]=new String[4];
    s1=S.split(",");
    Address ad=new Address(Integer.parseInt(s1[0],s1[1],s1[2],s1[3]));
    System.out.format("%-15s %-15s %-15s %s\n", "User ID","Street","City","State");
    System.out.format("%-15s %-15s %-15s %s\n", "getUser ID","getStreet","getCity","getState");
     System.out.format("%-15s %-15s %-15s %s\n", "getUser ID","getStreet","getCity","getState");
     System.out.format("%-15s %-15s %-15s %s\n", "getUser ID","getStreet","getCity","getState");
     System.out.format("%-15s %-15s %-15s %s\n", "getUser ID","getStreet","getCity","getState");

  }
}