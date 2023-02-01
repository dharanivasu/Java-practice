/* 2. Write a program to accept basic salary from user and find gross salary. Gross_Salary = basic+DA+HRA.  
      DA is 82% on basic and HRA is 70% on basic.  Use setter and getter methods to set and get values. 
      After printing gross salary display user defined message once object got garbage collected.

      Sample Input:
      Enter Basic salary: 23000
      
      Expected Output:
      Your gross salary is: 57960
      Object is garbage collected
*/

import java.util.*;

public class GrossSalary {
  private double basicSalary;
  private double da;
  private double hra;
  private double grossSalary;
  
  
  public void setBasicSalary(double basicSalary) {
    this.basicSalary = basicSalary;
  }
  
  
  public double getBasicSalary() {
    return basicSalary;
  }
  
  
  public void setDA(double da) {
    this.da = da;
  }
  
  
  public double getDA() {
    return da;
  }
  
  
  public void setHRA(double hra) {
    this.hra = hra;
  }
  
  
  public double getHRA() {
    return hra;
  }
  
 
  public void setGrossSalary(double grossSalary) {
    this.grossSalary = grossSalary;
  }
  
 
  public double getGrossSalary() {
    return grossSalary;
  }
  
  
  public void calculateGrossSalary() {
    da = 0.82 * basicSalary;
    hra = 0.70 * basicSalary;
    grossSalary = basicSalary + da + hra;
  }
  
  
  protected void finalize() {
    System.out.println("Object is garbage collected");
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Basic salary: ");
    double basicSalary = sc.nextDouble();
    
    GrossSalary salary = new GrossSalary();
    salary.setBasicSalary(basicSalary);
    salary.calculateGrossSalary();
    
    System.out.println("Your gross salary is: " + salary.getGrossSalary());
  }
}

