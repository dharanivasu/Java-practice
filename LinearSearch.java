// Linear search is searching key element from multiple elements 
//key 50==10,50==13,
class LinearSearch{
  //method
  public static int LinearSearch(int[] arr,int key){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        return i;
      }
    }
    return -1;
  }
  //main method 
  public static void main(String args[]){
    int a1[]={23,45,56,78,54,43};
     int key=78;
    System.out.println(key+ " found at index"+ LinearSearch(a1,key) );
  }
}