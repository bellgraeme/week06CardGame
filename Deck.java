import java.util.*;

public class Deck{

  private ArrayList<Card> deck;
  private int cardsUsed;
  

  public Deck(){

   this.deck = new ArrayList<Card>();
   this.cardsUsed = 0;
 }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }

  public Card getRandomCard() {
    Collections.shuffle(this.deck);
    Card card = this.deck.get(0);
    deck.remove(card);
    cardsUsed++;
    return card;
  }

 public void addFullDeck(){
  for ( int suit = Card.SPADES; suit <= 3; suit++ ) {
    for ( int value = 1; value <= 13; value++ ) {
      deck.add(new Card(value,suit));
      }
    }
  }

  public Card getCard(int index){
    return this.deck.get(index);
  }

  public int length(){
    return deck.size();
  }

  public int cardsUsed (){
    return this.cardsUsed;
  }

  public int cardsLeft(){
    return this.deck.size() - this.cardsUsed();
  }




 } 

