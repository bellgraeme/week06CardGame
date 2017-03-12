import java.util.*;

public abstract class Game {

  private static boolean winState;
  private ArrayList<Player> players;

  public Game(){
    winState = false;
    players = new ArrayList<Player>();
  }


  public static boolean checkWinState(){
    return winState;
  }

  public static void updateWinSate(){
    if (winState == false)
      winState = true;
    else
      winState = false;
  }

  public void addPlayer(Player player){
    this.players.add(player);
  }

  public int playerCount(){
    return players.size();
  }

  public ArrayList<Player> playerList(){
    return this.players;
  }

}