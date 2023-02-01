import java.util.*;
class Copy{
  public static void main(String args[])
  {
    int a[]={22,56,43,45,6,7};
    int b[]=new int[a.length];
    for(int i=0;i<a.length;i++)
    {
      b[i]=a[i];
    }
    for(int i=0;i<a.length;i++)
    {
      System.out.println(b);
    }
  }
  }
