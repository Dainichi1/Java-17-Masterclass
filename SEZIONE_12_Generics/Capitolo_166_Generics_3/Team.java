package SEZIONE_12_Generics.Capitolo_166_Generics_3;

import java.util.ArrayList;
import java.util.List;

record Affiliation (String name, String type, String countryCode) {

    @Override
    public String toString() {
        return name + " (" +type+" in"+countryCode+")";
    }
}
public class Team<T extends Player, S> {// S rappresenta la città del Team

    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private String teamName;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamMember (T t) {

        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMember() {

        System.out.print(teamName + " Roster:");
        System.out.println(affiliation == null ? "" : " AFFILIATION: "+affiliation);
        for (T t : teamMembers) {
            System.out.println(t.name());
        }
    }

    public int ranking () {
        return  (totalLosses * 2) + totalTies + 1;
    }

    public String setScore (int ourScore, int theirScore) {

        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "ties";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked "+ranking()+")";
    }
}
