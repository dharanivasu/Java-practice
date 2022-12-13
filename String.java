//read one string from user for example the string is admin@124 from this alphabets 5, special-1,digits-3//

import java.util.*;
class String{
  public static void main(String args[]){
     int alphabet = 0, digit=0,specialchar=0;
        System.out.println(" Alphabet, Digit, Specialchar ");
     Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter a String");
        String str = sc.nextLine (); 
        String s=new String();
    for(int i = 0; i < str.length(); i++){
            if( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {        
                    alphabet++;
                }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                digit++;
                }else{
                specialchar++;
            }
}
  }
}
