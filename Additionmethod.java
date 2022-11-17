//without return type and without parameter
void sum(){
  int a=10;
  int b=20;
  int sum=a+b;
  System.out.println(sum);
}
//  with return type and without parameters.
int sum(){
  int a=10;
  int b=20;
  int sum=a+b;
  return sum;
}
//  without return type and with parameters.
void sum(a,b){
  int sum=a+b;
   System.out.println(sum);
}
// with return type and with parameters.
int sum(a,b){
  int sum=a*b;
  return sum;
}