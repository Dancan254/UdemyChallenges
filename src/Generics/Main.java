package Generics;

record BaseBallPlayer(String name, String position){}
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
    }

    public static void scoreResult(BaseBallTeam team1, int t1_Score,
                                   BaseBallTeam team2, int t2_Score){

        String message = team1.setScore(t1_Score, t2_Score);
        team2.setScore(t2_Score, t1_Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
