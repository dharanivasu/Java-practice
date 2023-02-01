 import java.util.*;
class Palindrom{
public static void main(String args[])
{ 
int a[]={324,121,454,456,678};
int temp,rem,rev=0;
//to iterate array elements
System.out.println("plaindrome numbers");
for(int i=0;i<a.length;i++){
temp=a[i];//temp=121
rev=0;
while(temp>0){//0>0
rem=temp%10;//3%10=3
rev=rev*10+rem;//40+2=420+3=423
temp=temp/10;//324/10=32/10=3/10=0
}
if(a[i]==rev){//324==423
System.out.println(a[i]);
}
}
}
}