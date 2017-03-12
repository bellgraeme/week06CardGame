import static org.junit.Assert.*;
import org.junit.*;


public class GameTest{

  Game game;
  Player player1; 
  Player player2; 
  Player player3;

@Before
public void before(){

  player1 = new Player("Barny");
  player2 = new Player("Phill");
  player3  = new Player("Stan");
  game = new BlackJack();

  }

@Test
public void hasPlayers(){
  game.addPlayer(player1);
  game.addPlayer(player2);
  game.addPlayer(player3);
  assertEquals(3, game.playerCount());
}


}