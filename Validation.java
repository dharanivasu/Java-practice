import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidMobileNumber extends Exception {
    public InvalidMobileNumber(String message) {
        super(message);
    }
}

class Validation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Age must be greater than 18");
            }
            System.out.println("Enter your mobile number:");
            String mobileNumber = sc.next();
            if (!mobileNumber.matches("[0-9]{10}")) {
                throw new InvalidMobileNumber("Invalid mobile number. Number should be of 10 digits.");
            }
            System.out.println("Age and mobile number are valid.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());22
        } catch (InvalidMobileNumber e) {
            System.out.println(e.getMessage());
        }
    }
}
