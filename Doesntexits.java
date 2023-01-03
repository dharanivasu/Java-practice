import java.io.File;
class Doesntexits{
 
  public static void main(String args[]){
    
       File file=new File("data.txt");
    if(file.delete()){
      System.out.println(file.getName());
      
      }
    else{
      System.out.println("the file doesnot exist");
    }
    
 
   
    
    
  }
}