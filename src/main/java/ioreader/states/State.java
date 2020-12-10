package ioreader.states;

import library.NullOrEmpty;

public class State {

    private String stateName;
    private String capital;

    public State(String stateName, String capital) {
        NullOrEmpty.stringIsNullOrEmpty(stateName, "Statename is null or empty!");
        NullOrEmpty.stringIsNullOrEmpty(capital, "Capital is null or empty!");
        this.stateName = stateName;
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public String getCapital() {
        return capital;
    }
}
