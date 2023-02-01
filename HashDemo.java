/*    JFM1T13_Assignment5:  

      Create an application having a Generic HashMap with Empcode  as key and EmpName as value. Display only EmpNames as output. 
       Prompt the user input from the terminal.

      Sample Input: 
      Enter Emp code:101
      Enter Emp Name: Ram
      Enter another student (y/n)?y
      Enter Emp code:102
      Enter Emp Name: Vaibhav
      Enter another student (y/n)?y
      Enter Emp code:103
      Enter Emp Name: Priyanka
      Enter another student (y/n)?n

      Expected Output: 
        Ram
        Vaibhav
        Priyanka
       
*/

/*import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
 class HashDemo {

    public static void main(String[] args) {
       HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Emp code:");
        int n=sc.nextInt();
        System.out.println("Enter Emp Name:");
         String name=sc.next();
        System.out.println(" Enter another student (y/n)?");
        String choice=sc.next();
           if(choice.equals("y")){
             continue;
           }
            else{
              break;
            }
           

        for (int i = 0; i < 3; i++) {
            Integer a = sc.nextInt();
            String b = sc.next();

            hmap.put(a, b);
        }

        for (Map.Entry<Integer, String> m : hmap.entrySet()) {
           
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}  */


public class HashDemo {


    public static void main (String[] args){
         
        HashMap<Integer,String> list= new HashMap<Integer,String>();
        boolean val = true;
         
        Scanner sc = new Scanner(System.in);
        
        do{
            
            System.out.print("Enter Emp code :");
            Integer Empcode =Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter Emp name :");
            String EmpName=sc.nextLine();
            
            String EmpData = list.put(Empcode,EmpName);
           
            if(EmpData!=null){
            
            System.out.println("Emp Code "+Empcode+" is "+EmpData+" and has been overwitten by "+EmpName);
            }
           
            System.out.print("Enter another student (y/n)? : ");
            String choice =sc.nextLine();
            
            if(choice.equals("y")){
                continue;
            }
            else{
                break;
            }
        }
            
            while(val);
                    System.out.println("Employee Names");
            for(int Emp:list.keySet()){
                
                System.out.println(list.get(Emp));
            }
    } 

}