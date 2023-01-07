/* 3. Write a program to accept employee salary and 3 shopping bills, find how much % of amount 
      employee is spending on shopping on his/her salary. After printing % details, create another 
      reference variable for Employee object and clone employee object. Use setter and getter methods to set and get values. 
      Display user defined message once employee object got garbage collected.

      Sample Input: 
      Enter your salary: 10000
      Enter shopping bill1: 2000 
      Enter shopping bill2: 1400
      Enter shopping bill3: 500

      Expected Output:
      39 % of amount you are spending on shopping in your salary.
      Object got garbage collected.
*/

import java.util.Scanner;

public class EmployeeSalaryDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();

        System.out.println("Enter shopping bill1: ");
        int bill1 = sc.nextInt();

        System.out.println("Enter shopping bill2: ");
        int bill2 = sc.nextInt();

        System.out.println("Enter shopping bill3: ");
        int bill3 = sc.nextInt();

        int total = bill1 + bill2 + bill3/salary*100;
        //int shoppingPercentage = total / salary* 100;
     System.out.println(" % of amount you are spending on shopping in your salary."+ total);

        Employee employee = new Employee();
        employee.setSalary(salary);
        employee.setBill1(bill1);
        employee.setBill2(bill2);
        employee.setBill3(bill3);

        Employee employee2 = employee.clone();

       
        employee = null;
        
        System.gc();
    }
}

class Employee implements Cloneable {
    private int salary;
    private int bill1;
    private int bill2;
    private int bill3;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBill1() {
        return bill1;
    }

    public void setBill1(int bill1) {
        this.bill1 = bill1;
    }

    public int getBill2() {
        return bill2;
    }

    public void setBill2(int bill2) {
        this.bill2 = bill2;
    }

    public int getBill3() {
        return bill3;
    }

    public void setBill3(int bill3) {
        this.bill3 = bill3;
    }

   
    protected Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (Exception e) {
            throw new AssertionError();
        }
    }

    
    protected void finalize() throws Throwable {
        System.out.println("Object got garbage collected.");
    }
}