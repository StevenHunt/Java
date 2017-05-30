import java.util.*; 

Class BJS
{
 public static void main(String[]Args)
 {
      int money;          // Amount of money the user has.
      int bet;            // Amount user bets on a game.
      boolean userWins;   // Did the user win the game?
      
      System.out.println("Welcome to the game of blackjack.");
      ln();
      
      money = 100;  // User starts with $100.
   
      while (true) {
          console.putln("You have " + money + " dollars.");
          do {
             console.putln("How many dollars do you want to bet?  (Enter 0 to end.)");
             console.put("? ");
             bet = console.getlnInt();
             if (bet < 0 || bet > money)
                 console.putln("Your answer must be between 0 and " + money + '.');
          } while (bet < 0 || bet > money);
          if (bet == 0)
             break;
          userWins = playBlackjack();
          if (userWins)
             money = money + bet;
          else
             money = money - bet;
          console.putln();
          if (money == 0) {
             console.putln("Looks like you've are out of money!");
             break;
          }
      }
      
      console.putln();
      console.putln("You leave with $" + money + '.');
      
   } // end main()
   
   
   
   boolean playBlackjack() {
         // Let the user play one game of Blackjack.
         // Return true if the user wins, false if the user loses.

      Deck deck;                  // A deck of cards.  A new deck for each game.
      BlackjackHand dealerHand;   // The dealer's hand.
      BlackjackHand userHand;     // The user's hand.
      
      deck = new Deck();
      dealerHand = new BlackjackHand();
      userHand = new BlackjackHand();

      /*  Shuffle the deck, then deal two cards to each player. */
      
      deck.shuffle();
      dealerHand.addCard( deck.dealCard() );
      dealerHand.addCard( deck.dealCard() );
      userHand.addCard( deck.dealCard() );
      userHand.addCard( deck.dealCard() );
      
      console.putln();
      console.putln();
      
      /* Check if one of the players has Blackjack (two cards totaling to 21).
         The player with Blackjack wins the game.  Dealer wins ties.
      */
      
      if (dealerHand.getBlackjackValue() == 21) {
           console.putln("Dealer has the " + dealerHand.getCard(0)
                                       + " and the " + dealerHand.getCard(1) + ".");
           console.putln("User has the " + userHand.getCard(0)
                                         + " and the " + userHand.getCard(1) + ".");
           console.putln();
           console.putln("Dealer has Blackjack.  Dealer wins.");
           return false;
      }
      
      if (userHand.getBlackjackValue() == 21) {
           console.putln("Dealer has the " + dealerHand.getCard(0)
                                       + " and the " + dealerHand.getCard(1) + ".");
           console.putln("User has the " + userHand.getCard(0)
                                         + " and the " + userHand.getCard(1) + ".");
           console.putln();
           console.putln("You have Blackjack.  You win.");
           return true;
      }
      
      /*  If neither player has Blackjack, play the game.  The user gets a chance
          to draw cards (i.e., to "Hit").  The while loop ends when the user
          chooses to "Stand" or when the user goes over 21.
      */
      
      while (true) {
          
           /* Display user's cards, and let user decide to Hit or Stand. */

           console.putln();
           console.putln();
           console.putln("Your cards are:");
           for ( int i = 0; i < userHand.getCardCount(); i++ )
              console.putln("    " + userHand.getCard(i));
           console.putln("Your total is " + userHand.getBlackjackValue());
           console.putln();
           console.putln("Dealer is showing the " + dealerHand.getCard(0));
           console.putln();
           console.put("Hit (H) or Stand (S)? ");
           char userAction;  // User's response, 'H' or 'S'.
           do {
              userAction = Character.toUpperCase( console.getlnChar() );
              if (userAction != 'H' && userAction != 'S')
                 console.put("Please respond H or S:  ");
           } while (userAction != 'H' && userAction != 'S');

           /* If the user Hits, the user gets a card.  If the user Stands, the
              dealer gets a chance to draw and the game ends.
           */

           if ( userAction == 'S' ) {
                   // Loop ends; user is done taking cards.
               break;
           }
           else {  // userAction is 'H'.
                   // Give the user a card.  If the user goes over 21, the user loses.
               Card newCard = deck.dealCard();
               userHand.addCard(newCard);
               console.putln();
               console.putln("User hits.");
               console.putln("Your card is the " + newCard);
               console.putln("Your total is now " + userHand.getBlackjackValue());
               if (userHand.getBlackjackValue() > 21) {
                   console.putln();
                   console.putln("You busted by going over 21.  You lose.");
                   console.putln("Dealer's other card was the " + dealerHand.getCard(1));
                   return false;  
               }
           }
           
      } // end while loop
      
      /* If we get to this point, the user has Stood with 21 or less.  Now, it's
         the dealer's chance to draw.  Dealer draws cards until the dealer's total is > 16.
      */

      console.putln();
      console.putln("User stands.");
      console.putln("Dealer's cards are");
      console.putln("    " + dealerHand.getCard(0));
      console.putln("    " + dealerHand.getCard(1));
      while (dealerHand.getBlackjackValue() <= 16) {
         Card newCard = deck.dealCard();
         console.putln("Dealer hits and gets the " + newCard);
         dealerHand.addCard(newCard);
      }
      console.putln("Dealer's total is " + dealerHand.getBlackjackValue());
      
      /* Now, the winner can be declared. */
      
      console.putln();
      if (dealerHand.getBlackjackValue() > 21) {
         console.putln("Dealer busted by going over 21.  You win.");
         return true;
      }
      else if (dealerHand.getBlackjackValue() == userHand.getBlackjackValue()) {
         console.putln("Dealer wins on a tie.  You lose.");
         return false;
      }
      else if (dealerHand.getBlackjackValue() > userHand.getBlackjackValue()) {
         console.putln("Dealer wins, " + dealerHand.getBlackjackValue() 
                          + " points to " + userHand.getBlackjackValue() + ".");
         return false;
      }
      else {
         console.putln("You win, " + userHand.getBlackjackValue() 
                          + " points to " + dealerHand.getBlackjackValue() + ".");
         return true;
      }

   }  // end playBlackjack()
   

}  // end class
