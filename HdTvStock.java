/*  JFM1T13_Assignment4: 

      Write a program to create a class HDTV with the properties: 
         •	Brandname 
         •	Size 
      Create another class having an ArrayList and add 3 objects of HDTV into it. Display HDTV objects in sorted order of size.(Use Comparator) 

     Sample Output:
     4000 Sony 20
     2000 LG 26
     3000 MI 27
     1000 Samsung 28
*/

import java.lang.*;
import java.util.*;
 

class HdTvStock1 {
    int price;
    String Brandname;
    int Size;
 
    
    public  HdTvStock1(int price, String Brandname,int Size)
    {
        this.price = price;
        this.Brandname = Brandname;
        this.Size = Size;
    }
    
}
 


 

class BrandnameComparator implements Comparator<HdTvStock1> {
 
   
    public int compare(HdTvStock1 a, HdTvStock1 b)
    {
 
        return a.Brandname.compareTo(b.Brandname);
    }
}
 

class HdTvStock {
 
    
    public static void main(String[] args)
    {
 
        
        ArrayList<HdTvStock1> hdtv = new ArrayList<HdTvStock1>();
 
        hdtv.add(new HdTvStock1(4000, "Sony", 20));
        hdtv.add(new HdTvStock1(3000, "LG", 26));
        hdtv.add(new HdTvStock1(2000, "MI", 27));
        hdtv.add(new HdTvStock1(1000, "Samsung", 28));
 
       
        System.out.println("Unsorted");
 
        
       for(HdTvStock1 hd:hdtv)
            System.out.println(hd.price+" "+hd.Brandname+" "+hd.Size);
 
        
        //Collections.sort(hdtv, new SortbySize());
 
       
       // System.out.println("\nSorted by Size");
 
        
       // for (int i = 0; i < hdtv.size(); i++)
           // System.out.println(hdtv.get(i));
 
       
        Collections.sort(hdtv, new BrandnameComparator());
 
       
        System.out.println("\nSorted by Brandname");
 
        
       for(HdTvStock1 hd:hdtv)
            System.out.println(hd.price+" "+hd.Brandname+" "+hd.Size);
    }
}