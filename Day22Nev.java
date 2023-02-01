import java.util.*;
class Day22Nev{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string:");
    String s=sc.next();
    for(int i=0;i<s.length();i++){
      if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
        System.out.println("vowels are:"+s[i]);
      }
    }
  }
}