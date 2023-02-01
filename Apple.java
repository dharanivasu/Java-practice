import java.util.*;
class Apple {
   public static void main(String args[]) {
      Scanner Sc = new Scanner(System.in);
      System.out.println("Enter the size of the array that is to be created ::");
      
      int size = Sc.nextInt();
      int count = 0;
      int a[] = new int[size];
      
      System.out.println("Enter the elements of the array ::");

      for(int i = 0; i<size; i++) {
         a[i] = Sc.nextInt();
      }
      System.out.println("The array created is :: "+Arrays.toString(a));
      System.out.println("indices of duplicate elements in the array are elements :: ");
      Set set = new HashSet();

      for(int i = 0; i<a.length; i++) {
         if(set.add(a[i])) {
            count++;
            System.out.println("Index :: "+i+" Element :: "+a[i]);
         }
      }
   }
}