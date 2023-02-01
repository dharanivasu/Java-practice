
import java.util.*;
class OddorEven{
    public static void main(String args[]){
     int a[] = { 1,2,3,4,5,6,7,8,9,10,11 }; 
        int evenCount=0, oddCount=0;
        for(int i=0; i<a.length;i++){
            if(a[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Total Even Number : " + evenCount + "Total Odd Number : "+oddCount);
    }
}