/* class A{
  public static void main(String args[]){
    String str="Hi how are you";
    String rev=" ";
    String words[]=str.split(" ");
    System.out.println(words.length);
    for(int i=0;i<words.length;i++){
      System.out.println(words[i]);
    }
    
  }
}  */

public class A{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 5;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}    