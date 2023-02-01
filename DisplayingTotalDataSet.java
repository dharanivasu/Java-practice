/*3.Write a program to read data from matches.csv file and find out following points:
   • how many matches we have got in this dataset.
   • how many Seasons(years) we have got in this dataset.
   • how many venues we have got in this dataset.

   Expected Output:
   Number of matches: 750
   Number of seasons: 5
   Number of venues: 9
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DisplayingTotalDataSet {
    public static void main(String args[]) {
        int matches = 0;
        Set<String> seasons = new HashSet<>();
        Set<String> venues = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Match.csv"))) {
            String line = br.readLine(); // skip the header row
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                matches++;
                seasons.add(values[1]);
                venues.add(values[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of matches: " + matches);
        System.out.println("Number of seasons: " + seasons.size());
        System.out.println("Number of venues: " + venues.size());
    }
}