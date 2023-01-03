
import java.io.File; 
import java.io.IOException; 
class Createnewfile{
 
  public static void main(String args[]){
    try{
       File file=new File("data.txt");
    if(file.createNewFile()){
      System.out.println(file.getName());
    }
    else{
      System.out.println("already existed");
    }
    }
    catch(IOException e){
      e.printStackTrace();
    }
   
    
    
  }
}

