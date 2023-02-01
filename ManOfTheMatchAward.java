/* 4. Write a program to read data from matches.csv file and find out how many times a given player won
      the man of the match award in a given year?
   Sample Input:
   Enter player Name: Yuvraj Singh
   Enter Year:        2017

   Expected Output: 2 times
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ManOfTheMatchAward {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String playerName = sc.nextLine();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("Match.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            String matchYear = values[2];
            String manOfTheMatch = values[12];
            if (manOfTheMatch.equals(playerName) && matchYear.equals(String.valueOf(year))) {
                count++;
            }
        }

        System.out.println(playerName + " won the man of the match award " + count + " times in " + year);
    }
}