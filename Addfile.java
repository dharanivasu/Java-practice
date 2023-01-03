
  
import java.io.File;  
class Addfile{
 
  public static void main(String args[]){
  
   // String path=;
    
      File file=new File("/home/runner/Fast-Track-Java-dharanivasu/bitLabs/tarabai/files");
      
        
        String files[]=file.list();
        for(int i=0;i<files.length;i++){
          System.out.println(files[i]);
        }
 
    
      
    }
       
    
  }
