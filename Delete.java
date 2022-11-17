import java.util.*;
//Delete an Element from Array at Given Index

class Delete{
 
    public static void main(String args[]) {
        int count=0, i, index;
        int a[] = new int[100];
 
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        count = Sc.nextInt();
         // Take array input from user
         
        System.out.println("Enter " + count + " Numbers");
        for (i = 0; i <count; i++) {
            a[i] = Sc.nextInt();
        }
 
        System.out.println("Enter Index of Element to be Deleted");
        index = Sc.nextInt();
 
        // Move all elements right of index to left by one position 
        for (i = index; i < count - 1; i++) {
            a[i] = a[i + 1];
        }
 
        // decrement size of array
        count--;
 
        System.out.println("Final Array");
        for (i = 0; i < count; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
