/*Create a class named User having private attributes
Attributes
Datatype

name
String
username
String
password
String
contactDetail
ContactDetail

Create a class named ContactDetail having private attributes
Attributes
Datatype
mobile
String
alternateMobile
String
landLine
String
email
String
address
String

Include getter and setters for all attributes in both the classes
Include default and parameterized constructors for both the classes in the following order
User(String name, ContactDetail contactDetail, String username,String password)
ContactDetail(String mobile, String alternateMobile,String landLine, String email, String address)
Create a driver class called Main. In the Main method, obtain input from the user and display all the details.*/


import java.util.*;
class User{
   Private String name;
   Private ContactDetail contact;
   Private String username;
   Private String password;
  void setname(String name){
    this.name=name;
  }
  void setcontact(ContactDetail contact){
    this.contact=contact;
  }
  void setusername(String username){
    this.username=username;
  }
  void setpassword(String password){
     this.password=password;
  }
  String getname(){
    return name;
  }
  String getcontact(){
    return contact;
  }
  String getusername(){
    return username;
  }
    
    }

  void ContactDetail(String mobile, String alternateMobile,String landLine, String email, String address){
    this.mobile=mobile;
    this.alternatemobile=alternatemobile;
    this.landline=landline;
    this.email=email;
    this.address=adress;
  }
  }

class User{
  public static void main(String args[]){
    GetterSetter S=new GetterSetter(System.in);
    User S=new User("thara",1234567893,"abcd","xyz");
    ContactDetails S=new ContactDetails("oppo","vivo","asdf","lkjh@gmail.com","abc street"); 
    S.User();
    S.ContactDetails();
  }
  
}