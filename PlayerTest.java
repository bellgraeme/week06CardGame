import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class PlayerTest{

  Deck deck;
  Player player;

@Before
public void before(){
  deck = new Deck();
  player = new Player("Carl");
  deck.addFullDeck();
  
}

@Test
public void playerCanBeDealt(){
  player.dealCards(7, deck);
  assertEquals(7, player.getCardCount());
  }

  @Test
  public void canFindHandValue(){
    Card card1 = new Card(3,2);
    Card card2 = new Card(2,2);
    player.addCard(card2);
    player.addCard(card1);    
    assertEquals(5, player.handValue());
  }

  @Test
  public void canCountAce(){
    Card card1 = new Card(1,2);
    Card card2 = new Card(1,3);
    player.addCard(card2);
    player.addCard(card1);
    assertEquals(2, player.aceCount());
  }

  @Test
  public void canAddPlayers(){
    
  }



}