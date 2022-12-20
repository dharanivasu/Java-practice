class Difference{
  public int maxMinDiff(int ar[]){
    int max=ar[0];
    int min=ar[0];
    for(int i=0;i<ar.length;i++){
    if(ar[i]>max){
      max=ar[i];
    }
      if(ar[i]<min){
        min=ar[i];
      }
  }
    int diff=max-min;
      return diff;
  }
public static void main(String args[]){
  int array[]={23,78,53,20,45,67,89};
  Difference d=new Difference();
 System.out.println("difference is:" + d.maxMinDiff(array));
}
}