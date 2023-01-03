/* 3.Write a program to create custom exception to validate mobile number. Create InvalidMobileNumber and throw this exception 
   whenever user enters the mobile number by not following the below conditions.

  ==> mobile number should contain only digits.
  ==> mobile number should contain only 10 digits.
  ==> mobile number should start with 9 or 8 or 7 or 6.

  Sample input: 
  Enter your mobile number: 4565333953
  Sample output: java.lang.InvalidMobileNumber: "Invalid mobile number"

  Sample input: 
  Enter your mobile number: 9884533953
  Sample output: Valid Mobile number
*/
import java.util.*;

public class InvalidMobileNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mobileNumber = sc.nextLine();

        try {
            validateMobileNumber(mobileNumber);
            System.out.println("Valid mobile number");
        } catch (InvalidMobileNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
        // check if the mobile number contains only digits
        if (!mobileNumber.matches("[0-9]+")) {
            throw new InvalidMobileNumberException("Invalid mobile number: must contain only digits");
        }

        // check if the mobile number has 10 digits
        if (mobileNumber.length() != 10) {
            throw new InvalidMobileNumberException("Invalid mobile number: must have 10 digits");
        }

        //  mobile number starts with 9, 8, 7, or 6
        if (!mobileNumber.startsWith("9") && !mobileNumber.startsWith("8") && !mobileNumber.startsWith("7") && !mobileNumber.startsWith("6")) {
            throw new InvalidMobileNumberException("Invalid mobile number: must start with 9, 8, 7, or 6");
        }
    }
}

class InvalidMobileNumberException extends Exception {
    public InvalidMobileNumberException(String message) {
        super(message);
    }
}