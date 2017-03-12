import java.util.*;

public enum Suit {
  CLUB(0),  
  DIAMOND(1),
  SPADE(2),
  HEART(3);

  private final int suit; 

  Suit(int suit) {
   this.suit = suit;
 }

 public int suit(){
  return this.suit;
 }

}