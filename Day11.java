//write java program tofind highest frequescy  element in the array.
import java.util.*;
class Day11 {  
    public static void main(String args[]) { 
      Scanner Sc=new Scanner(System.in);
        System.out.println("enter array size");
        int a=Sc.nextInt();
      System.out.println("enter array element");
        int b=Sc.nextInt();
      int arr[]=new int[length];
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = 0;  
        for(int i = 0; i < arr.length; i++){  
         int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        
        System.out.println(" Element | Frequency");  
        
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("");  
    }}  
