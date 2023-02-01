/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/
import java.util.*;
class Employee {

    private String Name;

    private int id;

    private double Salary;
public Employee(String n, String i, double s){
        Name = n;
        id = id;
        if(s < 0){  

            Salary =0;
        }
else Salary = s;
    }

public String gettName() {

        return Name;
    }
public void setName(String name) {

        Name = name;
    }

    public int getid() {

        return id;

    }

public void setid(int id) {

        id = id;

    }

public double getSalary() {

        return Salary;

    }

public void setSalary(double s) {

        if(s < 0){

            Salary =0;

        }

else Salary = s;

    }

 

    public static void main(String[] args){
      Scanner S=new Scanner(System.in);

        System.out.println("Enter the  name: ");

        String name = S.next();

        System.out.println("Enter the id: ");

        int id = S.nextInt();

        System.out.println("Enter the Salary: ");

        double sal = S.nextDouble();

        Employee e1 =new Employee(name , id ,sal );
       Employee e2 =new Employee(name,id ,sal );


    }

}


//Good Job!
