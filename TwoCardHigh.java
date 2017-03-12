import java.util.*;

public class TwoCardHigh extends Game{
  
  public static void main(String[] args) {

      Player player1 = new Player("Barny");
      Player player2 = new Player("Carl");
      Deck deck = new Deck();
      deck.addFullDeck();
      player1.dealCards(2, deck);
      player2.dealCards(2, deck);
      Card card1 =  player1.getHand().get(0);
      Card card2 = player2.getHand().get(0);
      Card card11 =  player1.getHand().get(1);
      Card card22 = player2.getHand().get(1);
      if(card1.getValue() +  card11.getValue() > card2.getValue() + card22.getValue()){
        System.out.println("Hand1 wins");
      }
      else if(card2.getValue() + card22.getValue() > card1.getValue() + card22.getValue()){
        System.out.println("Hand2 wins");
      }
      else{
        System.out.println("its a draw");
        }
      }
    }
