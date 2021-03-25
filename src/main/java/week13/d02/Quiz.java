package week13.d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz {
    
    private List<Character> solution = new ArrayList<>();
    private Map<String, List<Character>> players = new HashMap<>();

    
    public String playerWithMostPoints() {
        int maxPoints = 0;
        int actualPionts;
        String playerName = "";
        for (Map.Entry<String, List<Character>> player : players.entrySet()) {
            actualPionts = 0;
            for (int i = 0; i < player.getValue().size(); i++) {
                actualPionts += getPoint(player.getValue().get(i), i);
            }
            if (maxPoints < actualPionts) {
                maxPoints = actualPionts;
                playerName = player.getKey();
            }
        }
        return playerName;
    }
    
    
    private int getPoint(Character answer, int point) {
        if (answer.equals(solution.get(point))) {
            return point + 1;
        }
        if (answer.equals("X")) {
            return 0;
        }
        return -2;
    }
    
    
    public String mostSkipAnswer() {
        String mostSkipper = "NA";
        int count = 0;
        for (Map.Entry<String, List<Character>> entry: players.entrySet()) {
            int actualCount = (int)entry.getValue().stream().filter(x -> x == 'X').count();
            if (count < actualCount) {
                count = actualCount;
                mostSkipper = entry.getKey();
            }
        }
        return mostSkipper;
    }
    
    
    public String answerIsWrongOrRight(String player, int taskNumber) {
        taskNumber -= 1;
        if (players.get(player).get(taskNumber) == solution.get(taskNumber)) {
            return player + " helyes választ adott a kérdésre";
        }
        return player + " helytelen választ adott a kérdésre";
    }
    
    
    public void readFile() {
        InputStream is = this.getClass().getResourceAsStream("results.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            for (Character letter : br.readLine().toCharArray()) {
                solution.add(letter);
            }
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String key = parts[0];
                Character answer = parts[1].charAt(0);
                if (!players.containsKey(key)) {
                    players.put(key, new ArrayList<>());
                }
                players.get(key).add(answer);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    public List<Character> getSolution() {
        return solution;
    }
    
    public Map<String, List<Character>> getPlayers() {
        return players;
    }
}
