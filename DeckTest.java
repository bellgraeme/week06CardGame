import static org.junit.Assert.*;
import org.junit.*;


public class DeckTest{

  Deck deck;

@Before
public void before(){
  deck = new Deck();
}


  @Test
  public void canCreateDeck(){
    deck.addFullDeck();
    assertEquals(52, deck.length());
  }

  @Test
  public void  cardHasName(){
    Card card = new Card(2,3);
    assertEquals("2 of Clubs", card.toString());
  }

}