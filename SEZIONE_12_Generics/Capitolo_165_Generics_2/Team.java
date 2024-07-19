package SEZIONE_12_Generics.Capitolo_165_Generics_2;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {

    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember (T t) {

        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMember() {

        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);
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
