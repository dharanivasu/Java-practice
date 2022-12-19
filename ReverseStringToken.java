import java.util.*;

 

class ReverseStringToken{
  
public   void  StngToken(String str){
  StringTokenizer st = new StringTokenizer(str);
   while(st.hasMoreTokens()){
 // System.out.println(st.nextToken());
  
 StringBuffer s= new StringBuffer(st.nextToken());
   s.reverse();
System.out.println(s);
}
}

 

public static void main(String args[]){
    
 MethodToken m=new MethodToken();
  m.StngToken("hi hello how are you");
  
  
}
}