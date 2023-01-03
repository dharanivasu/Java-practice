/* 4. Write a program to create custom exception to validate eligibility score to join in bitLabs. 
      Create InvalidScoreException and throw this exception if user entered score is less than 70.

  Sample input:
  Enter your score to check eligibility:  65

  Sample output: 
  Java.lang.InvalidScoreException: "Sorry, you are not eligible to join in bitLabs."


  Sample input:
  Enter your score to check eligibility:  89

  Sample output: 
  "Great, you are eligible to join in bitLabs."
*/

import java.util.Scanner;

public class InvalidScoreException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score to check eligibility: ");
        int score = sc.nextInt();

        try {
            validateScore(score);
            System.out.println("Great, you are eligible to join in bitLabs");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateScore(int score) throws InvalidScoreException1 {
        if (score < 70) {
            throw new InvalidScoreException1("Sorry, you are not eligible to join in bitLabs.");
        }
    }
}

class InvalidScoreException1 extends Exception {
    public InvalidScoreException1(String message) {
        super(message);
    }
}
