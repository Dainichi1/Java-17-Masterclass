package SEZIONE_11_Generics.Capitolo_165_Generics_2;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

    private List<BaseballPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private String teamName;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember (BaseballPlayer player) {

        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
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
