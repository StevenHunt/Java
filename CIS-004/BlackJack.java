/*
Steven Hunt, Java I, 
BlackJack Project
*/

import javax.swing.*;
import java.io.*;
import java.util.Random;
import java.util.*; 

public class BlackJack
{
     
       public static final int NUMCARDS = 13;
       public static final int NUMFACES = 4;
       public static final int NUMCARDSINDECK = 52;
       public static final int MaxHandSize = 20;
       public static final int NumCardsToStartWith = 2;
       public static final int HouseLimit = 17;

       // Card values. 

       public static final int DEUCE = 2;
       public static final int THREE = 3;
       public static final int FOUR = 4;
       public static final int FIVE = 5;
       public static final int SIX = 6;
       public static final int SEVEN = 7;
       public static final int EIGHT = 8;
       public static final int NINE = 9;
       public static final int TEN = 10; 
       public static final int JACK = 11;
       public static final int QUEEN = 12;
       public static final int KING = 13;
       public static final int ACE = 14;
       
       // Card faces. 

       public static final int SPADES = 0;
       public static final int HEARTS = 1;
       public static final int DIAMONDS = 2;
       public static final int CLUBS = 3;
       
       // Dealer and player. 

       public static final int PLAYER = 1;
       public static final int DEALER = 2;

       public static int DealerTotal = 0;
       public static int PlayerTotal = 0;
       public static boolean DealerStay = false;
       public static boolean PlayerStay = false;

       // Count the number of deals for indexing the cards ( used to advance array forward to hold new cards in hand ). 

       public static int PlayerDeal = 0;
       public static int DealerDeal = 0;
       
       public static CARD[] DeckOfCards = new CARD[NUMCARDSINDECK];
       public static CARD[] DealerHand = new CARD[MaxHandSize];
       public static CARD[] PlayerHand = new CARD[MaxHandSize];

       public static String PlayerName = "";
       public static boolean DisplayAllDealerCards = false;
       public static boolean EASY = false;
       
       public static int DealerWins = 0;
       public static int PlayerWins = 0;

public static class CARD
{
       // Constructor. 

       public CARD()
       {
              TheCard = BlackJack.DEUCE;
              TheFace = BlackJack.HEARTS;
              Drawn = false;
       }

       // Overloaded constructor. 

       public CARD(int card, int face)
       {
              TheCard = card;
              TheFace = face;
              Drawn = false;
              
              switch(TheCard)
              {
                  case BlackJack.DEUCE : PointValue = 2; break;
                  case BlackJack.THREE : PointValue = 3; break;
                  case BlackJack.FOUR : PointValue = 4; break;
                  case BlackJack.FIVE : PointValue = 5; break;
                  case BlackJack.SIX : PointValue = 6; break;
                  case BlackJack.SEVEN : PointValue = 7; break;
                  case BlackJack.EIGHT : PointValue = 8; break;
                  case BlackJack.NINE : PointValue = 9; break;
                  case BlackJack.TEN : PointValue = 10; break;
                  case BlackJack.JACK : PointValue = 10; break;
                  case BlackJack.QUEEN : PointValue = 10; break;
                  case BlackJack.KING : PointValue = 10; break;
                  case BlackJack.ACE : PointValue = 11; break;
                  default : break;
              }
       }

       public void DisplayCard()
       {        
              String OUT = "\n     ";

              switch(TheCard)
              {
                  case BlackJack.DEUCE : OUT = OUT + "Two"; break;
                  case BlackJack.THREE : OUT = OUT + "Three"; break;
                  case BlackJack.FOUR : OUT = OUT + "Four"; break;
                  case BlackJack.FIVE : OUT = OUT + "Five"; break;
                  case BlackJack.SIX : OUT = OUT + "Six"; break;
                  case BlackJack.SEVEN : OUT = OUT + "Seven"; break;
                  case BlackJack.EIGHT : OUT = OUT + "Eight"; break;
                  case BlackJack.NINE : OUT = OUT + "Nine"; break;
                  case BlackJack.TEN : OUT = OUT + "Ten"; break;
                  case BlackJack.JACK : OUT = OUT + "Jack"; break;
                  case BlackJack.QUEEN : OUT = OUT + "Queen"; break;
                  case BlackJack.KING : OUT = OUT + "King"; break;
                  case BlackJack.ACE : OUT = OUT + "Ace"; break;
                  default : break;
              }

              OUT = OUT + " of ";

              switch(TheFace)
              {
                 case BlackJack.SPADES : OUT = OUT + "Spades"; break;
                 case BlackJack.HEARTS : OUT = OUT + "Hearts"; break;
                 case BlackJack.DIAMONDS : OUT = OUT + "Diamonds"; break;
                 case BlackJack.CLUBS : OUT = OUT + "Clubs"; break;
                 default : break;
              }

              OUT = OUT + ". Points = " + PointValue + ".";

              System.out.print(OUT);
       }

       // Public accessors. 

       public int GetFace() { return TheFace; }
       public int GetCard() { return TheCard; }
       public int GetPointValue() { return PointValue; }
       public boolean GetDrawn() { return Drawn; }

       public void SetFace(int x) { TheFace = x; }
       public void SetCard(int x) { TheCard = x; }
       public void SetPointValue(int x) { PointValue = x; }
       public void SetDrawn(boolean x) { Drawn = x; }

       // Private data members. 

       private int TheFace;
       private int TheCard;
       private int PointValue = 0;
       private boolean Drawn = false;

} // Close card class.

       public static void Game()
       {
              // Initialize values for a round. 
              
	      DealerTotal = 0;
              PlayerTotal = 0;
              PlayerDeal = 0;
              DealerDeal = 0;
              DealerStay = false;
              PlayerStay = false;
              DisplayAllDealerCards = false;

              // Start populating deck with deuces. 
              
	      int CardType = DEUCE;

              // Populate the deck array with card values. 
              
	      CLEAR(3);
              System.out.print("\n     -------------- Creating a 52 card deck now --------------\n");

              try { Thread.sleep(1500); }
              catch(Exception e) {  }

              for(int CardInDeck = 0; CardInDeck < NUMCARDSINDECK; )
              {
                  // Each card value has 4 faces. 

                  for(int CardFace = 0; CardFace < NUMFACES; CardFace++)
                  {
                       DeckOfCards[CardInDeck] = new CARD(CardType,CardFace);
                       DeckOfCards[CardInDeck].DisplayCard();
                       CardInDeck++;
                  }
                  CardType++;
              }

              try { Thread.sleep(600); }
              catch(Exception e) {  }
	      
              System.out.println("\n" + "\n     The dealer is shuffling the cards and deals out: \n");

	      // Both dealer and player start with 2 cards. 

              for(int x = 0; x < NumCardsToStartWith; x++)
              {
                  DRAW(PLAYER);
                  DRAW(DEALER);
              }

              DisplayHand(PLAYER);
              DisplayHand(DEALER);

              Deal();

              //Stop hiding Dealer's CARDs and POINTs
              DisplayAllDealerCards = true;
              
              System.out.print("\n     " + PlayerName + " and Dealers final hands:\n");
              DisplayHand(PLAYER);
              DisplayHand(DEALER);

              // If either dealer or player gets Blackjack!

              if(PlayerTotal == 21)
              { 
                 System.out.print("     " + PlayerName + ", congrats you got BlackJack! \n\n");
                 PlayerWins++;
              }

              else if(DealerTotal == 21)
              { 
                 System.out.print("     Dealer has BlackJack :( \n\n");  
                 DealerWins++;
              }

              else if(PlayerTotal > 21)
              {
                    System.out.print("\n     " 
                    + PlayerName + ", sorry you've Busted: \n\n");
                    DealerWins++;
              }

              else if(DealerTotal > 21)
              {
                    System.out.print("\n     Dealer Busted! \n\n"); 
                    PlayerWins++;
              }

              // Player decides to stay, check whos hand is better. 

              if(PlayerStay)
              {
                  if(PlayerTotal == DealerTotal)
                  { 
                    System.out.print("\n                   " + PlayerName + ", you've tied with the dealer: \n\n");
                    PlayerWins++;
                    DealerWins++;
                  }
                  else if(PlayerTotal > DealerTotal)
                  { 
                    System.out.print("\n     " + PlayerName + " won this round! \n\n"); 
                    PlayerWins++;
                  }
                  else if(DealerTotal > PlayerTotal)
                  { 
                    System.out.print("\n     Sorry, the dealer won this round: \n\n");
                    DealerWins++;
                  }
              }

              for(int x = 0; x < MaxHandSize; x++)
              {
                  DealerHand[x] = null;
                  PlayerHand[x] = null;
              }
       }

       public static void DRAW(int Hand)
       {
              Random PEACH = new Random();

              int ACard = (PEACH.nextInt(NUMCARDSINDECK) + 1) - 1;

              // Find a card that hasn't been drawn. 

              while(DeckOfCards[ACard].GetDrawn())
              { ACard = (PEACH.nextInt(NUMCARDSINDECK) + 1) - 1; }

	      // Mark card as drawn, so that it can't be chosen again until next round. 

              DeckOfCards[ACard].SetDrawn(true);

              if(Hand == PLAYER)
              {
                  PlayerHand[PlayerDeal] = DeckOfCards[ACard];
                  PlayerTotal = PlayerTotal + PlayerHand[PlayerDeal].GetPointValue();
                  PlayerDeal++;
              }

              else
              {
                  DealerHand[DealerDeal] = DeckOfCards[ACard];
                  DealerTotal = DealerTotal + DealerHand[DealerDeal].GetPointValue();
                  DealerDeal++;
              }
       }

       public static void DisplayHand(int Hand)
       {
              if(Hand == PLAYER)
              {
                  System.out.print("\n     " + PlayerName +"'s hand: \n");

                  for(int x = 0; x < MaxHandSize; x++)
                  {
                      if(PlayerHand[x]!= null)
                      {
                          PlayerHand[x].DisplayCard();
                      }
                      else { break; }
                  }

                  System.out.print("\n     " + PlayerName + "'s total points are " + PlayerTotal + ".\n\n");
              }

              else
              {
                  System.out.print("\n     Dealer's hand: \n");

                  if(DisplayAllDealerCards || EASY)
                  {
                      // Display dealers cards ( Easy Mode )

                      for(int x = 0; x < MaxHandSize; x++)
                      {
                          if(DealerHand[x]!= null)
                          {
                             DealerHand[x].DisplayCard();
                          }
                          else
                          { break; }
                      }
		      // Easy mode on. 
                      System.out.print("\n     Total dealer points is " + DealerTotal + ".\n\n");

                  }

                  else
                  {
                      // Hide dealers first card. 

                      System.out.print("\n     HIDDEN CARD.");

                      for(int x = 1; x < MaxHandSize; x++)
                      {
                          if(DealerHand[x]!= null)
                          {
                             DealerHand[x].DisplayCard();
                          }
                          else
                          { break; }
                      }
                      // Regular mode on. 
                      System.out.print("\n     Dealers total points are not available. \n\n");
                  }

              }
       }

       public static String INPUT()
       {
              LineNumberReader BANANA = new LineNumberReader(new InputStreamReader(System.in));
              String input = "";
              try { input = BANANA.readLine(); }
              catch(IOException APPLE) { System.err.println("Error..."); }
              return input;
       }

       public static void Deal()
       {
              String choice = "#";

              // Player goes first. Round isn't over until player or dealer reaches 21, busts, or both player and dealer decide to stay!

              while(choice.charAt(0) != 'q' &&
                    DealerTotal < 21 &&
                    PlayerTotal < 21 &&
                    PlayerStay == false
                    )
              {
                  System.out.println("\n     The Dealer asks:\n\n" + "     " + PlayerName + ", do you want to (H)it or (S)tay:  \n\n");

                  choice = INPUT().toLowerCase();

                  switch(choice.charAt(0))
                  {
                      case 'h' : System.out.print("\n     " + PlayerName + " wants to HIT.\n");
                                 Hit(PLAYER);
                                 break;
                      case 's' : System.out.print("\n     " + PlayerName + " wants to STAY.\n");
                                 PlayerStay = true;
                                 DisplayHand(PLAYER);
                                 break;
                      default : System.out.print("\n     Invalid input!\n");
                                choice = "INVALID_INPUT";
                                break;
                  }

		  // If invalid input, skip dealer and go back to player. 

                  char X;
                  
                  if(!choice.equals("INVALID_INPUT"))
                  {
                       // Dealer only draws if player hasn't busted. 

                       if(PlayerTotal < 21)
                       {
                            if(DealerTotal < HouseLimit)
                            {
                                System.out.print("\n     The Dealer is going to take another card.\n");
                                Hit(DEALER);
                            }
                            else
                            {
                                System.out.print("\n     The Dealer decides to STAY.\n");
                                DealerStay = true;
                                DisplayHand(DEALER);
                            }

                       }  // Close if player doesn't bust.

                  }  // Close for invalid choice.

              } // Close while loop = true.

       }  // Close function. 

       public static void Hit(int WHOEVER)
       {
              DRAW(WHOEVER);

              if(WHOEVER == PLAYER)
              {
                 if(PlayerTotal > 21)
                 {
                    for(int x = 0; x < MaxHandSize; x++)
                    {
                       if(PlayerHand[x]!= null)
                       {
                           if(PlayerHand[x].GetCard() == ACE)
                           {
                                System.out.print("\n     " + PlayerName + ", you've busted but we'll convert your ACE from 11 points to 1 point. \n");
                                PlayerHand[x].SetPointValue(1);
                                break; // Set points of only 1 ACE to 1. 
                           }

                       }
                       else
                       { break; }
                    } // CLoses for loop. 

                    // Recount point value of cards after converting players ACE.
                    PlayerTotal = 0;

                    for(int x = 0; x < MaxHandSize; x++)
                    {
                         if(PlayerHand[x]!= null)
                         {
                             PlayerTotal = PlayerTotal + PlayerHand[x].GetPointValue();
                         }
                         else { break; }
                    }

                 } // Closes if PlayerTotal.

              } // Closes if WHOEVER == PLAYER.
              
              
              else // Must be dealer. 
              {
                 if(DealerTotal > 21)
                 {
                    for(int x = 0; x < MaxHandSize; x++)
                    {
                       if(DealerHand[x]!= null)
                       {
                           if(DealerHand[x].GetCard() == ACE)
                           {
                                System.out.print("\n     Dealer's HAND is over 21 but an ACE was found.\n" + "     We'll convert the ACE from 11 points to 1 point!\n");
                                DealerHand[x].SetPointValue(1);
                                break; //Set points of only 1 ACE to 1.
                           }

                       }
                       else
                       { break; }
                    } // Closes for loop. 

                    // Recount point value of cards after converting dealeres ACE. 
                    DealerTotal = 0;

                    for(int x = 0; x < MaxHandSize; x++)
                    {
                         if(DealerHand[x]!= null)
                         {
                             DealerTotal = DealerTotal + DealerHand[x].GetPointValue();
                         }
                         else { break; }
                    }
                 }

              }

              DisplayHand(WHOEVER);

      } // Closes Hit function. 

       public static void main(String args[])
       {
              System.out.print("\n\n\n\n                    Welcome to the game of BlackJack! \n\n");
	      System.out.print("                    What's your name:  ");
              PlayerName = INPUT();

              System.out.print(
              "\n\n                    Hey " + PlayerName +", what would you like to do:\n\n");

              String choice = "#";
              while(choice.charAt(0) != 'q')
              {
                    System.out.print("                        (P)lay BlackJack    \n");
                    if(!DisplayAllDealerCards)
                    { System.out.print("                        (E)asy Dealer     \n"); }
                    else
                    { System.out.print("                        (N)ormal Dealer \n"); }
                    System.out.print("                        (C)redits      \n");
                    System.out.print("                        (Q)uit              \n\n\n\n");
                    System.out.print("                    Dealers Score = " + DealerWins + "\n");
                    System.out.print("                    Players Score = " + PlayerWins + "\n");
                    CLEAR(3);

                    choice = INPUT();

                    switch(choice.charAt(0))
                    {
                          case 'p' : Game(); break;
                          case 'c' : Credits(); break;
                          case 'e' : EASY = true; break;
                          case 'n' : EASY = false; break;                          
			  case 'q' : break;
                          default : System.out.println("     Sorry, that was an invalid choice.\n");
                                    break;
                    }
              }
       }


       public static void Credits()
       {
	      CLEAR(5); 
              System.out.print("\n                                  CREDITS  \n\n"); 
              System.out.print("\n                          Programmer: Steven Hunt           \n"); 
              System.out.print("\n                       Institution: West Valley College  \n"); 
              System.out.print("\n                               Course: Java I  \n"); 
              System.out.print("\n                              Date: 04/15/2014  \n"); 
              PAUSE();
       }

       public static void PAUSE()
       {
          // Makeshift Pause command. 

          String CONTINUE = "";
          LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
          while(CONTINUE == "")
          {
                System.out.print("\n\n\n                       Paused. Press ENTER to continue. \n \n");
                try { CONTINUE = cin.readLine(); }
                catch (IOException e) { System.err.println("Error."); }
          }
        CLEAR(4); 
      }

      public static void CLEAR(int x)
      {
             for(int z = 0; z < x; z++)
             {
                System.out.println();
             }
             System.out.print("                   \n");
      }

} 
