//Reverse String 
import java.util.*;
class ReverseString{
  public void reverseString(){
    String s="Hi Hello How are you?";
    String word[]=s.split(" ");
    String reverseword=" ";
    for(int i=0;i<word.length;i++){
      reverseword=" ";
      for(int j=word[i].length()-1;j>=0;j--){
        reverseword+=word[i].charAt(j);
      }
      System.out.println(reverseword);
    }
    
  }
  public static void main(String args[]){
    ReverseString rs=new ReverseString();
    rs.reverseString();
  }
}