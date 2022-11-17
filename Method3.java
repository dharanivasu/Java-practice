class Method3{
  
 static int  abcd(int width,int height){  
    
    int abcd;  
    int area=width*height;  
       return area; 
     }
  //inside method to call to excute
  public static void main(String args[]){
  int result=abcd(10,20);
    System.out.println(result);
  }
}
