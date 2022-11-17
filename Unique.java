import java.util.*;
class Unique {

 public static void main(String args[]) {

      Scanner Sc = new Scanner(System.in);

      System.out.println("Enter the size of the array :");
      int size = Sc.nextInt();

      int a[] = new int[size];
      System.out.println("Enter the elements of the array:");
  
      for(int i=0; i<a.length; i++) {
         a[i] = Sc.nextInt();
      }

    Arrays.sort(a);     
    for (int i=0;i<a.length;i++)
    System.out.println(a[i]);
    int i=0;
    System.out.println("Unique Elements in array:");
    while(i<a.length)
    {
        if(a[i]!=a[i+1])
        {
            System.out.println(a[i]);
        }
        i=i+2;
    }
}
}