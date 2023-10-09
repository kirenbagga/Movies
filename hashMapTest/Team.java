import java.util.HashMap;
import java.util.Map;

public class Team{
    private String name;
    private Map<Position, String> players;
    public Team(String name){
        this.name=name;
        this.players=new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(Strig name) {
        this.name = name;
    }

    public String getPlayer(Position position) {
        return this.players.get(position);
    }

    public void setPlayer(Position position,String player) {
        if(position==null){
            throw new IllegalArgumentException("position should not be null");
        }else{
        this.players.put(position,player);}
    }

}