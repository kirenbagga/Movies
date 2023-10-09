
public class GameTeamMain {
    public static void main(String[] args) {
       

        Team bulls=new Team("chicago bulls");
        bulls.setPlayer(Position.SHOOTING_GUARD, "kirna");
        bulls.setPlayer(Position.SMALL_FORWARD, "aska");
        bulls.setPlayer(Position.POWER_FORWARD, "uccu");
        bulls.setPlayer(Position.CENTER, "umes");
        bulls.setPlayer(Position.POINT_GUARD, "Randy Brown");

        Team pitions=new Team("Detroit pitions");
         pitions.setPlayer(Position.SHOOTING_GUARD, "qqq");
        pitions.setPlayer(Position.SMALL_FORWARD, "aaaa");
        pitions.setPlayer(Position.POWER_FORWARD, "zzzz");
        pitions.setPlayer(Position.CENTER, "xxxx");
        pitions.setPlayer(Position.POINT_GUARD, "Randy Brown");
        Game game1=new Game("tpt");
        game1.begin(bulls, pitions);
        System.out.println(game1.details());
    }
    
}
