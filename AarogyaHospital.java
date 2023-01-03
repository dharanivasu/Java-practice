//package aarogya_hospital;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


// the main class
public class AarogyaHospital{

	static int count=0;
        // class for storing the patient information
	class AarogyaMember{
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
    String name;
    String gender;
    String city;
    String address;
    String guardian_name;
    String guardian_address;
    String date_of_admission;
    int age;
    long  aadharNo;
    long contactNumber;
    long guardian_contact;
    boolean recoverd;
	    // make constructor for the class and assign it a unique Id
    int id;
	    public AarogyaMember(){
        id=count;
        count++;
        recoverd=false;
	    }
    
    	    // for taking patient information
	    public void input(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the name");
        name=Sc.next();
        System.out.println("Enter the age");
        age=Sc.nextInt();
        System.out.println("Enter the gender");
        gender=Sc.next();
        System.out.println("Enter the aadharNo");
        aadharNo=Sc.nextInt();
         System.out.println("Enter the contactNumber");
        contactNumber=Sc.nextInt();
        System.out.println("Enter the city");
        city=Sc.next();
        System.out.println("Enter the address");
        address=Sc.next();
        System.out.println("Enter the date_of_admission");
        date_of_admission=Sc.next();
        System.out.println("Enter the guardian_name");
        guardian_name=Sc.next();
        System.out.println("Enter the guardian_address");
        guardian_address=Sc.next();
        System.out.println("Enter the guardian_contact");
        guardian_contact=Sc.nextInt();
        System.out.println("patient register"+id);
	    }
    
    public void display(AarogyaMember aroh){
      System.out.println(aroh.id+" "+aroh.name+" "+aroh.gender+" "+aroh.aadharNo+" "+aroh.contactNumber+" "+aroh.city+" "+aroh.address+" "+aroh.date_of_admission+" "+aroh.guardian_name+" "+aroh.guardian_address+" "+aroh.guardian_contact);
    }
    
	}

	// pick the choice of task to be performed
	static long choices(){
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		
          
    // create scanner class to take input
    Scanner Sc=new Scanner(System.in);
	    long option=Sc.nextLong();
	    return option;
	}
  

	public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    boolean flag=false;
    AarogyaHospital obj= new AarogyaHospital();
    AarogyaHospital.AarogyaMember obj2= obj.new AarogyaMember();
		ArrayList<AarogyaHospital.AarogyaMember> list= new ArrayList<AarogyaHospital.AarogyaMember>();
		// initialise array list to store list of patients information
		
		//for adding aarogya member information
		while(true){

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7){
			
			}
			// take the input and add in the arrayList
			else if(option==1){
        AarogyaHospital.AarogyaMember obj4= obj.new AarogyaMember();
        obj4.input();
        list.add(obj4);
        }
			//iterate and print all the patients information
	       		 else if(option==2){
              for(AarogyaHospital.AarogyaMember obj3:list){
                // obj2.display(obj3);
                System.out.println(obj3.name+" "+obj3.id);
              }
	       		 }
			
			// print details of the patient with a particular id (take id as input)
	                else if(option==3){
                    int id;
                    System.out.println("Enter the id");
                    id=Sc.nextInt();
                    for(AarogyaMember obj3:list){
                      if(obj3.id==id){
                        obj2.display(obj3);
                        flag=true;
                      }
                    }
                    if(flag=false){
                      System.out.println("patient not found based on id");
                    }
	                }
			
			// to print all the patients from a particular city (take city as input)
	                else if(option==4){
                    String city;
                    System.out.println("Enter the city");
                    city=Sc.next();
                    for(AarogyaMember obj3:list){
                      if(obj3.city.equals(city)){
                        obj2.display(obj3);
                        flag=true;
                      }
                    }
                    if(flag==false){
                      System.out.println("Patient not found based on city");
                    }
	               }
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
                   int age;
                   System.out.println("Enter the age");
                   age=Sc.nextInt();
	                for(AarogyaMember obj3:list){
                    
                    if(obj3.age==age){
                      
                      obj2.display(obj3);
                      flag=true;
                    }
                  }
                  if(flag==false){
                    System.out.println("not patient matched with this age");
                  }
	              }
	              // take member id as input to maintain recovered information of patient
	               else if(option==6){
	                int id;
                   System.out.println("Enter the id");
                   id=Sc.nextInt();
                   for(AarogyaMember obj3:list){
                     if(obj3.id==id){
                       obj3.recoverd=true;
                       obj2.display(obj3);
                     }
                   }
	              }
	              //take member id as input to delete patient information
	              else if(option==7){
                  int id;
                  System.out.println("Enter the id");
                  id=Sc.nextInt();
                  AarogyaHospital.AarogyaMember abr=null;
                  for(AarogyaMember obj3:list){
                    if(obj3.id==id){
                     abr=obj3;
                    }
                    
                  }
                  list.remove(abr);
                  System.out.println("delete sucessfully");
	              }
			
	              else{
	             break;
	             }
		}
	}
}