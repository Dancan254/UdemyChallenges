package Generics;

import ObjectOrientedProgramming.Interface.ExtendeDemo.A;

interface Player{
    String name();
}
record BaseBallPlayer(String name, String position) implements Player{}
record FootBallPlayer(String name, String position) implements Player{}
record HockeyTeamPlayer(String name, String position) implements Player{}
record VolleyBallPlayer(String name, String position) implements Player{}



public class Main {

    public static void main(String[] args) {

        Affiliation aff = new Affiliation("city", "Nairobi", "Kenya");
        BaseBallTeam phillies = new BaseBallTeam("Philladephia");
        BaseBallTeam astros = new BaseBallTeam("Huoston Astros");

        scoreResult(phillies, 30, astros, 40);

        //add players
        var ian = new BaseBallPlayer("Ian", "Striker");
        var Ann = new BaseBallPlayer("Ann", "Defender");

        phillies.addTeamMember(ian);
        astros.addTeamMember(Ann);

        //list
        phillies.listTeamMembers();
        astros.listTeamMembers();

        SportsTeam afc = new SportsTeam("Classic xi");
        var Jimmy = new FootBallPlayer("Jimmy", "Winger");
        afc.addTeamMember(Jimmy);
        afc.listTeamMembers();

        SportsTeam hockey = new SportsTeam("Ranger");
        var Mickey = new HockeyTeamPlayer("Mickey", "keeper");
        hockey.addTeamMember(Mickey);
        hockey.listTeamMembers();

        System.out.println("Using generic class team");
        //using generic class Team
        Team<BaseBallPlayer, Affiliation> baseBallPlayerTeam = new Team<>("DEKut");
        var Duncan = new BaseBallPlayer("Duncan", "Winger");
        baseBallPlayerTeam.addTeamMember(Duncan);
        baseBallPlayerTeam.listTeamMembers();

        //football player
        Team<FootBallPlayer, Affiliation> footBallPlayerTeam = new Team<>("Kimathi", aff);
        var Koshy = new FootBallPlayer("Stewart", "RightBack");
        footBallPlayerTeam.addTeamMember(Koshy);
        footBallPlayerTeam.listTeamMembers();

        //volley ball player
        Team<VolleyBallPlayer, String> volley = new Team<>("Super Strikers", "City in Nairobi, Kenya");
        volley.addTeamMember(new VolleyBallPlayer("Peris", "Booster"));
        volley.listTeamMembers();

        var canberra = new Team<VolleyBallPlayer, Affiliation>("Canberra", aff);
        canberra.addTeamMember(new VolleyBallPlayer("Sylus", "Spike"));
        canberra.listTeamMembers();
        scoreResult(canberra, 50, volley, 60);

    }

    public static void scoreResult(BaseBallTeam team1, int t1_Score,
                                   BaseBallTeam team2, int t2_Score){

        String message = team1.setScore(t1_Score, t2_Score);
        team2.setScore(t2_Score, t1_Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_Score,
                                   Team team2, int t2_Score){

        String message = team1.setScore(t1_Score, t2_Score);
        team2.setScore(t2_Score, t1_Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
