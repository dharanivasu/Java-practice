//read String 'Hi mam You are wow'.we have to find the String palindrome words.//
import java.util.*;

  class Main{
  public static void main(String args[]){
    String str="hi mam you are amazing";
    String s[]=new String[5];
    s=str.split(" ");
    // System.out.println(s.length);
    int a[]=new int[5];
    for(int i=0;i<s.length;i++){
        a[i]=s[i].length();
        // System.out.println(a[i]);
    }
   int min=a[0];
   for(int j=0;j<a.length;j++){
       if(min>a[j]){
           min=a[j];
       }
   }
   for(int k=0;k<s.length;k++){
    if(min==s[k].length()){
        System.out.println("min word is "+s[k]);
  }
}
}
}
