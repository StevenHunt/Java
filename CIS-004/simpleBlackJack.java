import java.util.*;
public class BlackJack {


public static void main(String[] args) 

{
    Scanner in = new Scanner(System.in); // Scanner in. 
    
    int usersDecision = 0; // User Decision variable. 
    int usersValue = 0; // User value variable
    int dealersValue = 0; // Dealer value variable

    String[] card = { "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"}; // Rank arrays. 
  
    ArrayList<String> usersCards = new ArrayList<String>(); // Array lists users cards.
    ArrayList<String> dealersCards = new ArrayList<String>(); // Array lists dealers cards. 


    for (int i = 0; i <= 0; i++) { // Generate dealers first hand. 
        int randomGenNumber = (int) (Math.random()*13); 

        dealersCards.add(card[randomGenNumber]);
    }

    System.out.println("Welcome to the game of BlackJack! \n"); 
    

    System.out.println("The Dealer was dealt: " + dealersCards); // Prints dealers first hand. 


 
    for (int i = 0; i <= 1; i++) { // Deals user 2 cards. 

        int randomGenNumber = (int) (Math.random()*13); 

        usersCards.add(card[randomGenNumber]);
    }



    System.out.println("The User was dealt: " + usersCards); // Prints users 2 cards. 




    if(usersCards.contains("Ace")) { // Checks to see if User was delt BlackJack. 
        if(usersCards.contains("King") || usersCards.contains("Queen") || usersCards.contains("Jack") || usersCards.contains("10")){
            System.out.println("Congrats you've got BlackJack!!");
            System.exit(0);
        }
	}
	  else {  
        System.out.println("You did not get BlackJack! \n[1] Hit\n[2] Stay");
    }


    

    int x = 0;  // Takes users decision. 
   

	while(x==0) { // While loop. 
	usersDecision = in.nextInt();

        switch (usersDecision) { // Switch statement for users decision.  
        

	case 1: // Prints users decision. 
            System.out.println("You've Hit - Additional card being dealt: ");
            x = 0;

           
           
            for (int i = 0; i <= 0; i++) { // While hitting is true. 
                int randomGenNumber = (int) (Math.random()*13); // Random card. 

                usersCards.add(card[randomGenNumber]);
            }

            System.out.println(usersCards + "\n"); // Prints users cards and randomly generated card. 

         
            usersValue = 0; // Card values.  

            for(int i = 0; i < usersCards.size(); i++) {
                if(usersCards.get(i).equals("2")) {
                    usersValue += 2;
                } else if(usersCards.get(i).equals("3")) {
                    usersValue += 3;
                } else if(usersCards.get(i).equals("4")) {
                    usersValue += 4;
                } else if(usersCards.get(i).equals("5")) {
                    usersValue += 5;
                } else if(usersCards.get(i).equals("6")) {
                    usersValue += 6;
                } else if(usersCards.get(i).equals("7")) {
                    usersValue += 7;
                } else if(usersCards.get(i).equals("8")) {
                    usersValue += 8;
                } else if(usersCards.get(i).equals("9")) {
                    usersValue += 9;
                } else if(usersCards.get(i).equals("10")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Jack")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Queen")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("King")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Ace")) {
                    usersValue += 11;
                }
            }


            System.out.println("Users Cards Value: " + usersValue + ""); // Prints users actual cards value. 

            

	      if(usersValue != 21 && usersValue <=21){ // Prompts user to make another move if user doesn't have BlackJack. 
                System.out.println("You Did Not Get BlackJack!\n[1] Hit\n[2] Stay");

            } else if (usersValue == 21) { // Prints for user BlackJack.  
                System.out.println("You Got BlackJack! Congrats!");
            } else if (usersValue > 21) { // Prints for user bust.
                System.out.println("You've Busted! You Lose!");
                System.exit(0);
            }

            break; // Break between cases. 

        case 2: 
            System.out.println("You've Stuck - Your Cards: " + usersCards +"\n"); // If user chooses to stick, prints cards. 
            x = 1;
           

            usersValue = 0;

            for(int i = 0; i <usersCards.size(); i++) { // For loop. 
                if(usersCards.get(i).equals("2")) {
                    usersValue += 2;
                } else if(usersCards.get(i).equals("3")) {
                    usersValue += 3;
                } else if(usersCards.get(i).equals("4")) {
                    usersValue += 4;
                } else if(usersCards.get(i).equals("5")) {
                    usersValue += 5;
                } else if(usersCards.get(i).equals("6")) {
                    usersValue += 6;
                } else if(usersCards.get(i).equals("7")) {
                    usersValue += 7;
                } else if(usersCards.get(i).equals("8")) {
                    usersValue += 8;
                } else if(usersCards.get(i).equals("9")) {
                    usersValue += 9;
                } else if(usersCards.get(i).equals("10")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Jack")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Queen")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("King")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Ace")) {
                    usersValue += 11;
                }
            }
            

            System.out.println("Dealing Dealers Second Card!"); // Dealing for dealers second card. 

            for (int i = 0; i <= 0; i++) { // Randomly generates dealers second card. 
                int randomGenNumber = (int) (Math.random()*13);

                dealersCards.add(card[randomGenNumber]);
            }
            System.out.println(dealersCards + "\n"); // Prints dealers cards. 

          
            dealersValue = 0;

            for(int i = 0; i < dealersCards.size(); i++) { // For loop & generates dealer card value. 
                if(dealersCards.get(i).equals("2")) {
                    dealersValue += 2;
                } else if(dealersCards.get(i).equals("3")) {
                    dealersValue += 3;
                } else if(dealersCards.get(i).equals("4")) {
                    dealersValue += 4;
                } else if(dealersCards.get(i).equals("5")) {
                    dealersValue += 5;
                } else if(dealersCards.get(i).equals("6")) {
                    dealersValue += 6;
                } else if(dealersCards.get(i).equals("7")) {
                    dealersValue += 7;
                } else if(dealersCards.get(i).equals("8")) {
                    dealersValue += 8;
                } else if(dealersCards.get(i).equals("9")) {
                    dealersValue += 9;
                } else if(dealersCards.get(i).equals("10")) {
                    dealersValue += 10;
                } else if(dealersCards.get(i).equals("Jack")) {
                    dealersValue += 10;
                } else if(dealersCards.get(i).equals("Queen")) {
                    dealersValue += 10;
                } else if(dealersCards.get(i).equals("King")) {
                    dealersValue += 10;
                } else if(dealersCards.get(i).equals("Ace")) {
                    dealersValue += 11;
                }
            }
        

            System.out.println("Dealers Cards Value: " + dealersValue + ""); // Prints dealers actual card value. 

          

            int y = 0; // Takes action on dealers value. 
            while(y==0) {

                dealersValue = 0;   
                for(int i = 0; i < dealersCards.size(); i++) {
                    if(dealersCards.get(i).equals("2")) {
                        dealersValue += 2;
                    } else if(dealersCards.get(i).equals("3")) {
                        dealersValue += 3;
                    } else if(dealersCards.get(i).equals("4")) {
                        dealersValue += 4;
                    } else if(dealersCards.get(i).equals("5")) {
                        dealersValue += 5;
                    } else if(dealersCards.get(i).equals("6")) {
                        dealersValue += 6;
                    } else if(dealersCards.get(i).equals("7")) {
                        dealersValue += 7;
                    } else if(dealersCards.get(i).equals("8")) {
                        dealersValue += 8;
                    } else if(dealersCards.get(i).equals("9")) {
                        dealersValue += 9;
                    } else if(dealersCards.get(i).equals("10")) {
                        dealersValue += 10;
                    } else if(dealersCards.get(i).equals("Jack")) {
                        dealersValue += 10;
                    } else if(dealersCards.get(i).equals("Queen")) {
                        dealersValue += 10;
                    } else if(dealersCards.get(i).equals("King")) {
                        dealersValue += 10;
                    } else if(dealersCards.get(i).equals("Ace")) {
                        dealersValue += 11;
                    }
                }
               
                if(dealersValue <= 16) { // If dealers card value is less then 17, than dealer has to hit. 
                    
		    int randomGenNumber = (int) (Math.random()*13); // Generates another random card for dealer. 
                    dealersCards.add(card[randomGenNumber]);
                    
		    System.out.println("Dealer has less than 17 - Taking Another Card\n"); // Still less than 17, dealer has to take another card. 
                    System.out.println("Dealers Cards: " + dealersCards); // Prints dealers cards.
                    

		    dealersValue = 0; // If dealer has less than 17, then the dealer has to hit. 
                    for(int i = 0; i < dealersCards.size(); i++) {
                        if(dealersCards.get(i).equals("2")) {
                            dealersValue += 2;
                        } else if(dealersCards.get(i).equals("3")) {
                            dealersValue += 3;
                        } else if(dealersCards.get(i).equals("4")) {
                            dealersValue += 4;
                        } else if(dealersCards.get(i).equals("5")) {
                            dealersValue += 5;
                        } else if(dealersCards.get(i).equals("6")) {
                            dealersValue += 6;
                        } else if(dealersCards.get(i).equals("7")) {
                            dealersValue += 7;
                        } else if(dealersCards.get(i).equals("8")) {
                            dealersValue += 8;
                        } else if(dealersCards.get(i).equals("9")) {
                            dealersValue += 9;
                        } else if(dealersCards.get(i).equals("10")) {
                            dealersValue += 10;
                        } else if(dealersCards.get(i).equals("Jack")) {
                            dealersValue += 10;
                        } else if(dealersCards.get(i).equals("Queen")) {
                            dealersValue += 10;
                        } else if(dealersCards.get(i).equals("King")) {
                            dealersValue += 10;
                        } else if(dealersCards.get(i).equals("Ace")) {
                            dealersValue += 11;
                        }

                    }
                    System.out.println("Dealers Cards Value: " + dealersValue + "\n"); // Prints dealers actual card value. 
                } 

                

                if(dealersValue == 17 ) { // If dealer has 17, has to stick. 
                    System.out.println("Dealer Has 17 - Dealer Sticks\n"); // Prints dealers cards are equal to 17 or above and has to stick. 
                    y = 1;

                    if(usersValue < 17) { // Compares and prints users results if users cards are under 17.
                        System.out.println("You Have: " + usersValue + " - You Lost");
                    } else if(usersValue == dealersValue) {
                        System.out.println("You Have: " + usersValue + " - You Pushed");
                    } else {
                        System.out.println("You Have: " + usersValue + " - You Won!");
                    }
                }

                if(dealersValue > 17 && dealersValue < 21) { // If dealer  has between 17 and 21, the dealer has to stick. 
                    System.out.println("Dealer Has: " + dealersValue + "- Dealer Sticks\n" );
                    y = 1;

                    if(usersValue < 21) { // Compares and prints users results if users cards are under 21.
                        System.out.println("You Have: " + usersValue + " - You Lost");
                    } else if(usersValue == dealersValue) {
                        System.out.println("You Have: " + usersValue + " - You Pushed");
                    } else {
                        System.out.println("You Have: " + usersValue + " - You Won!");
                    }
                }

                if(dealersValue == 21) { // Prints dealer has BlackJack when dealer has 21. 
                    System.out.println("Dealer Has BlackJack\n");
                    y = 1;
                    if(usersValue == dealersValue) { // Prints user has pushed at 21 also. 
                        System.out.println("You Have: " + usersValue + "- You Pushed!");
                    }
                }

                if(dealersValue > 21) { // Checks if dealer has over 21 and prints dealer has busted. 
                    System.out.println("Dealer Has Busted - You Win!");
                    y = 1;
                }

            }
            break;
        default:
            System.out.println("Not A Valid Selection");
        }

    };
  }
}
