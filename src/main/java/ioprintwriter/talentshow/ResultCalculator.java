package ioprintwriter.talentshow;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {

    private List<Vote> votes = new ArrayList<>();
    private List<Production> productions = new ArrayList<>();

    public void writeResultToFile(Path resultFile) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(resultFile))){
            for (Production production: productions) {
                pw.print(production.getId() + " ");
                pw.print(production.getName() + " ");
                pw.println(productionPoints(production.getId()));
            }
            pw.print("Winner: " + winnerName());
        } catch (IOException ex) {
            throw new IllegalStateException("Cant write file");
        }
    }

    private int productionPoints(int id) {
        for (Vote vote: votes) {
            if (id == vote.getId()) {
                return vote.getNumber();
            }
        }
        return 0;
    }

    private String winnerName() {
        String winnerName;
        int winnerId = winnerId();
        for (Production production : productions) {
            if (production.getId() == winnerId) {
                return production.getName();
            }
        }
        return "No winner";
    }

    private int winnerId() {
        int winnerId = 0;
        int winnerPoints = 0;
        for (Vote vote: votes) {
            if (vote.getNumber() > winnerPoints) {
                winnerId = vote.getId();
                winnerPoints = vote.getNumber();
            }
        }
        return winnerId;
    }

    public void readTalents(Path talentsFile) {
        try (BufferedReader pw = Files.newBufferedReader(talentsFile)){
            String line;
            while ((line = pw.readLine()) != null) {
                createProduction(line);
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Cant read file.");
        }
    }

    public void calculateVotes(Path votesFile) {
        setUpVotes();
        try (BufferedReader br = Files.newBufferedReader(votesFile)){
            String line;
            while ((line = br.readLine() )!= null) {
                voteCounter(line);
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Cant read file.");
        }
    }

    private void voteCounter(String line) {
        for (Vote vote: votes) {
            if (vote.getId() == Integer.parseInt(line)) {
                vote.incNum();
            }
        }
    }

    private void setUpVotes() {
        for (Production production: productions) {
            votes.add(new Vote(production.getId(), 0));
        }
    }

    private void createProduction(String line) {
        int id = Integer.parseInt(line.split(" ")[0]);
        String name = line.split(" ")[1];
        productions.add(new Production(id, name));
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public List<Production> getProductions() {
        return productions;
    }
}
