public class FrequenceElement {  
    public static void main(String[] args) {  
      int [] arr = new int [] {1, 2,9,1,9, 8, 3, 2, 2, 2, 5, 1};
      int [] fr = new int [arr.length]; 
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                   
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        
        System.out.println(" Element --- Frequency");  
         
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  

     
                System.out.println("    " + arr[i] + "    |    " + fr[i]); 
         
    }
      int k;
      int index=0;
    int min=fr[0];
    for(k=0;k<fr.length;k++){
      if(fr[k]!=-1){
        if(min>fr[k]){
          min=fr[k];
          index=k;
        }
      }
    }
    System.out.println("minimum frequnecy is :");
    System.out.println(arr[index]+" "+fr[index]);

    }
       

}




  