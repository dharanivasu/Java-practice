/*   JFM1T12_Assignment5:

     Write a program to build any collection containing duplicates. Create its copy with all duplicates removed. 
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     4
     Enter Number 0
     4
     Enter Number 1
     3
     Enter Number 2
      3
     Enter Number 3
     4
     
     Expected Output:
     After removing duplicates: [4, 3]
*/     
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.*;  
class Duplicate {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Collection<String> collection = new ArrayList<>();
  
        
        System.out.println("Enter how many numbers you want: ");
    int num=sc.nextInt();
    System.out.println("Enter Number");
     for(int i=0;i<num;i++){
      collection.add(sc.next());
    }
        System.out.println(
            "Displaying the initial collection");
        System.out.println(collection);
  
        
        HashSet<String> hashSet = new HashSet<>(collection);
        System.out.println("Displaying the HashSet");
        System.out.println(hashSet);
        collection.clear();
        collection.addAll(hashSet);
        System.out.println("After removing duplicates:");
        System.out.println(collection);
    }
}