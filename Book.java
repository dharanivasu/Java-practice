/*Regular Expression
When the users book a ticket we know that HallBooking class makes an entry and generate an id for it. The id generated by the system should only have numbers in it. But due to some mishappenings, it seems to have characters other than numbers. So, write a program to validate these id using regex patterns.
 
Input Format:
The first line input(String) corresponds to the Hall Booking ID.
Refer sample input for formatting specifications.
 
 
Output Format:
The output consists of string which displays "Valid Booking ID" if booking id composed only of numbers , else it displays "Invalid Booking ID".*/

import java.util.*;
class Book{
  public static void main(String args[]){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter the ticket id");
    String s1=Sc.nextLine();
    for(int i=0;i<s1.length;i++){
      if(s1.charAt(i)=='1'||s1.charAt(i)=='2'||s1.charAt(i)=='3'||s1.charAt(i)=='4'||s1.charAt(i)=='5'||s1.charAt(i)=='6'||s1.charAt(i)=='7'||s1.charAt(i)=='8'||s1.charAt(i)=='9'||s1.charAt(i)=='0'){
        count++;
      }
    }
    if(count=s1.length()){
      System.out.println("valid");
    }
    else{
      System.out.println(" not valid");
    }
  }
}
