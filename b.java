class b{
  public static int LinearSearch(int[] arr,int key){
    for (int i=0;i<arr.length;i++){
      if(arr[i] == key){
        return i;
      }
    }
    return -1;
  }
  public static void main(String args[]){
    int a[]={12,23,34,45,56,78};
    int key=56;
    System.out.println(key + "found at index"+ LinearSearch(a,key));
  }
}