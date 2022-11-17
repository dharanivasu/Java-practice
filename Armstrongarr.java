 import java.util.*;
class Armstrongarr{
public static void main(String args[])
{
int a[]={324,121,454,456,678,153,371};
int temp,rem,sum=0;
//to iterate array elements
System.out.println("amstrong numbers");
for(int i=0;i<a.length;i++){
temp=a[i];//temp=121
sum=0;
while(temp>0){//121>0
rem=temp%10;//3%10=3
sum=sum+(rem*rem*rem);//40+2=420+3=423+1
temp=temp/10;//324/10=32/10=3/10=0
}
if(a[i]==sum){//324==423
System.out.println(a[i]);
}
}
}
}