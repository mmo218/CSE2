/* Megan Olivola
hw10 - shuffling
This program takes a deck of 52 cards and shuffles them.  Then gives you a randomized hand.
November 3rd, 2015 */

import java.util.Scanner; //import scanner

public class Shuffling{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};  //array of suit names  
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; //array of rank names
String[] cards = new String[52]; //52 cards in a deck
String[] hand = new String[5]; //5 cards in my hand
for (int i=0; i<52; i++){
  cards[i]=rankNames[i%13]+suitNames[i/13]; //define each card with a different rank and suit name
}
printArray(cards);
System.out.println("Shuffled"); //tell user that you are shuffling
shuffle(cards);
printArray(cards);
System.out.println("Randomized hand!");
hand = randomizeHand(cards);
printArray(hand);
  } //end of main method
 //method printArray will print out each card in the array with with a space after
public static void printArray(String [] cards){
    for (int j=0; j<cards.length; j++){
        System.out.print(cards[j]+" "); //print out each card with a space after
    }
    System.out.println(""); //add a space
    return; //and return back to the main program
}//end of printArray method

//method shuffle will shuffle the cards int the deck and return the shuffled deck
//to the main program
public static String [] shuffle(String[]cards){
    for (int k=0; k<100; k++){
        int destination = (int)(Math.random()*52); //figure out which card to pick
        String temp = cards[0]; //create a temp number
        cards[0] = cards[destination]; //switch the values
        cards[destination] = temp;
        }
    return cards;
} //end of shuffle method

//method randomizeHand
//will pick 5 random cards
public static String [] randomizeHand(String[] cards){
    int Card1 = (int)(Math.random()*52); //figure out which card to pick
    int Card2, Card3, Card4, Card5;
    do{
        Card2 = (int)(Math.random()*52);
    } while (Card2 == Card1); //repeat until they are different values
    do{
        Card3 = (int)(Math.random()*52);
    } while (Card3 == Card1 || Card3 == Card2); //repeat until they are different values
    do{
        Card4 = (int)(Math.random()*52);
    } while (Card4 == Card1 || Card4 == Card2 || Card4 == Card3); //repeat until they are different values
    do{
        Card5 = (int)(Math.random()*52);
    } while (Card5 == Card1 || Card5 == Card2 || Card5 == Card3 || Card5 == Card4); //repeat until they are different values
    String [] hand = new String [5];
    hand[0] = cards[Card1];
    hand[1] = cards[Card2];
    hand[2] = cards[Card3];
    hand[3] = cards[Card4];
    hand[4] = cards[Card5];
    
    return hand;
}

  
  
}
