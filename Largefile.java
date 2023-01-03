/* Imagine you are building a program that processes and stores data from a large number of text files. You want to ensure that the program is able to handle files of any size, but you also want to be notified if a file is unusually large. You could create a custom exception called LargeFileException that is thrown when the size of a file exceeds a certain threshold. */
import java.util.*;
class LargefileException extends Exception{
  public LargefileException (String s){
  super(s);
}

}
  
class Largefile{
  //final length of textfile
     long filesize=1000l;
//method for large
    public void process(String filepath) throws LargeFileException.IOException {
        File file = new File(filepath);
        long size= file.length();
        if (size>filesize) {
            throw new LargeFileException("File size exceeded threshold: " + filesize+ " bytes");
        }
       else{
         FileReader fr=new FileReader(filepath);
         int i;
         while((i=fr.read())!=-1){
           System.out.println((char)i);
         }
       }
    }
//main method
public static void main(String[] args) throws IOException{
    //try and catch block for custom exception
    try {
      Large la=new Large();
      la.process("input.txt");
    } catch (LargeFileException e) {
      System.out.println( e.getMessage());
    }catch (LargeFileException o) {
      System.out.println( o.getMessage());
 
  }
}