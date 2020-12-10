package ioreader.states;

import library.NullOrEmpty;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();

    public void readStatesFromFile(String pathString) {
        NullOrEmpty.stringIsNullOrEmpty(pathString, "Path is null or empty");
        try (BufferedReader reader = Files.newBufferedReader(Path.of(pathString), Charset.forName("UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("-");
                states.add(new State(words[0], words[1]));
            }
        } catch (IOException ex) {
            throw new IllegalStateException("Can't read file!");
        }
    }

    public String findCapitalByStateName(String stateName) {
        NullOrEmpty.stringIsNullOrEmpty(stateName, "State name is null or empty!");
        for (State state: states) {
            if (state.getStateName().equals(stateName)) {
                return state.getCapital();
            }
        }
        throw new IllegalArgumentException("No state with this name!");
    }

    public List<State> getStates() {
        return new ArrayList<>(states);
    }
}
