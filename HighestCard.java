import java.util.*;

public class HighestCard extends Game{
  
  public static void main(String[] args) {

      Player player1 = new Player("Barny");
      Player player2 = new Player("Carl");
      Deck deck = new Deck();
      deck.addFullDeck();
      player1.dealCards(1, deck);
      player2.dealCards(1,deck);
      Card card1 =  player1.getHand().get(0);
      Card card2 = player2.getHand().get(0);
      if(card1.getValue() > card2.getValue()){
        System.out.println("Hand1 wins");
      }
      else if(card2. getValue() > card1.getValue()){
        System.out.println("Hand2 wins");
      }
      else{
        System.out.println("its a draw");
        }
      }
    }

  



