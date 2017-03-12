import java.io.Console;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Player{
  private String name;
  private ArrayList<Card> hand;

  public Player(String name) {
    hand = new ArrayList<Card>();
    name = name;
  }



  public ArrayList<Card> getHand(){
    return this.hand;
  }

  public void clear() {
    hand.clear();
  }

  public void addCard(Card card ) {
    hand.add(card);
  }

  public void removeCard(Card card) {
   hand.remove(card);
 }


 public void removeCard(int position) {
   if (position < 0 || position >= hand.size())
     throw new IllegalArgumentException("Position does not exist in hand: "
       + position);
   hand.remove(position);
 }

 public int getCardCount() {
   return hand.size();
 }

 public void dealCards(int numberOfCards, Deck deck){
   for( int i = 0; i < numberOfCards; i++){
     Card card = deck.getRandomCard();
     hand.add(card);
   }
  }

  public int handValue(){
    int total = 0;
    for( Card card : this.getHand()){
      total += card.getValue();
    }
    return total;
  }

  public int aceCount(){
    int aceCount = 0;
    for( Card card : this.getHand()){
      if (card.getValue() == 1) aceCount++;
      }
      return aceCount;   
  }

  public String name(){
    return this.name;
  }


  public int play(Deck deck){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int handvalue = 0;
  loop: while(handvalue <= 21){
      if(this.aceCount() > 0){
        handvalue += aceCount() * 10;
        System.out.println("Hello " + this.name() + " your hand value is " + this.handValue() +" and you have " + this.aceCount() + " Aces in your hand");
        String input = reader.readLine("Will the next move be? To stick (S) or twist (T) or (R)reduce your value of your Ace to 1");
        input.toUpperCase();
      if(input == "S"){
            handvalue += this.handValue();}
      else if(input == "T"){Card card = new Card();
            card = deck.getRandomCard();
            this.addCard(card);
            System.out.println("Your new hand is " + (handvalue + this.handValue()));}
      else if(input == "R"){
              handvalue -= 10;}
      else
          {System.out.println("Invalid selection");}
      }
      else{System.out.println("Hello " + this.name() + " your hand value is " + this.handValue());
      String input = reader.readLine("Will the next move be? To stick (S) or twist (T)");
      input.toUpperCase();
      if(input == "S"){
          handvalue += this.handValue();}
      else if(input == "T"){Card card = new Card();
        card = deck.getRandomCard();
        this.addCard(card);
        System.out.println("Your new hand is " + (handvalue + this.handValue()));}
      else
        {System.out.println("Invalid selection");}

      }
       
    }
    return handvalue;
  }
}  
      
    
  
