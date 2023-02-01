/* 5.Write a program to read data from matches.csv and find out which team had won by maximum wickets.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MaximumWickets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Match.csv"));
        String line;
        Map<String, Integer> teamWins = new HashMap<>();
        int maxWickets = Integer.MIN_VALUE;
        String winningTeam = "";

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            String winner = values[10];
            String winType = values[9];
            int winWickets = Integer.parseInt(values[11]);
            if (winType.equals("wickets")) {
                if (winWickets > maxWickets) {
                    maxWickets = winWickets;
                    winningTeam = winner;
                }
                if (!teamWins.containsKey(winner)) {
                    teamWins.put(winner, 1);
                } else {
                    teamWins.put(winner, teamWins.get(winner) + 1);
                }
            }
        }

        System.out.println("The team that won by maximum wickets is " + winningTeam + " with " + maxWickets + " wickets.");
    }
}