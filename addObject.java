import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Team team = new Team();

        team.addPlayer(new Player("helmut"));
        team.addPlayer(new Player("johan"));
        team.addPlayer(new Player("Uwe"));

        System.out.println("teamlist:");
        team.getAllPlayer();
    }
}




public class Player
{
    private String PlayerName;

    public Player(String PlayerName)
    {
        setPlayerName(PlayerName);
    }

    public String getPlayerName()
    {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName)
    {
        this.PlayerName = PlayerName;
    }
}




public class Team
{
    private final List<Player> playerListe = new LinkedList<>();

    public void addPlayer(Player player)
    {
        if (player != null)
        {
            playerListe.add(player);
        }
    }

    public Player getPlayer(int index)
    {
        return playerListe.get(index);
    }

    public void getAllPlayer()
    {
        for (Player player : playerListe)
        {
            System.out.println(player.getPlayerName());
        }
    }
}
