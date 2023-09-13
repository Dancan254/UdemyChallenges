package Generics;

interface Player{}
record BaseBallPlayer(String name, String position) implements Player{}
record FootBallPlayer(String name, String position) implements Player{}
record HockeyTeamPlayer(String name, String position) implements Player{}


public class Main {

    public static void main(String[] args) {
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
    }

    public static void scoreResult(BaseBallTeam team1, int t1_Score,
                                   BaseBallTeam team2, int t2_Score){

        String message = team1.setScore(t1_Score, t2_Score);
        team2.setScore(t2_Score, t1_Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
