import java.util.HashMap;
import java.util.*;

public class Employee1 {
  public static void main(String args[]) {
    HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
    Scanner sc = new Scanner(System.in);

    // Add employee data to the map
    System.out.println("Enter the number of employees: ");
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      System.out.println("Enter Employee code:");
      int code = sc.nextInt();
      System.out.println("Enter Employee name:");
      String name = sc.next();
      employeeMap.put(code, name);
    }

    // Display only the Employee Names
    System.out.println("Employee Names: ");
    for (String name : employeeMap.values()) {
      System.out.println(name);
    }
  }
}