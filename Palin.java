import java.util.*;
class Palin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // array
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].length()==3){
                System.out.println(str[i]);
            }
        }
    }
}