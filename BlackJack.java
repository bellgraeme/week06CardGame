import java.util.*;

public class BlackJack extends Game{

  public static void main(String[] args) {

    BlackJack game = new BlackJack();

    Player player1 = new Player("Barny");
    Player player2 = new Player("Carl");

    game.addPlayer(player2);
    game.addPlayer(player1);

    Deck deck = new Deck();
    deck.addFullDeck();

    player2.dealCards(2, deck);
    player1.dealCards(2, deck);

    int score1 = player1.play(deck);
    int score2 = player2.play(deck);

      if(score1 > 21 && score2 > 21){
        System.out.println("Both players are bust!");
      }

    else if(score1 > 21 ){
      System.out.println(player1.name() + " is bust, " + player2.name() + " is winner!");}
      else if(score2 > 21){
        System.out.println(player2.name() + " is bust, " + player1.name() + " is winner!");}
      
      else if (score1 > score2){System.out.println(player1.name() + " is the Winner!" );}
        else{
          System.out.println(player2.name() + " is the Winner!");}
        }
    }
      
    
