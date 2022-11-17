class Primemethod{
  static int perfectNumber(int num){
    int sum=0,count=0;
    for(int i=1;i<=num/2;i++){
      if(num%i==0){
           sum=sum+i;
      }
    }
      if(sum==num){
      return 1;
      }
      else{
        return 0;
      }
  }
  
  public static void main(String args[]){
    //call the method
     int result=perfectNumber(6);
    if(result==1){
      System.out.println("perfect number");
    }
    else{
      System.out.println("not perfect");
    }
    
    }
    }
 