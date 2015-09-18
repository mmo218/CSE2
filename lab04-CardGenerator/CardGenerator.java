//////////////////////////
//Megan Olivola
//lab 04 - Card Generator
// 9/18/2015

//This code will generate a random card for the magician to use

//define a class
public class CardGenerator {
    //define a main method
    public static void main(String[] args){
        //generate a number between 1 and 52
        int RandomCard=(int)(Math.random()*(53))+1;
        System.out.println(RandomCard);
        
        //assign my values to specific cards
        String Rank="";
        
        switch( RandomCard%13 ){
    case 1:
    Rank = "Ace";
    break;
     case 2:
    Rank = "2";
    break;
     case 3:
    Rank = "3";
    break;
     case 4:
    Rank = "4";
    break;
     case 5:
    Rank = "5";
    break;
     case 6:
    Rank = "6";
    break;
     case 7:
    Rank = "7";
    break;
     case 8:
    Rank = "8";
    break;
     case 9:
    Rank = "9";
    break;
     case 10:
    Rank = "10";
    break;
     case 11:
    Rank = "Jack";
    break;
    case 12:
    Rank= "Queen";
    break;
    case 13:
    Rank = "King";
    break;
        }
    
    //define the suit
    
    String Suit = "";
    
    if (RandomCard>=1 && RandomCard<=13){
        Suit = "diamonds";
        
    }
    else if (14<=RandomCard && RandomCard<=26){
        Suit = "clubs";
    }
    
    else if (27<=RandomCard && RandomCard<=39){
        Suit = "hearts";
    }
    else if (40<=RandomCard && RandomCard<=52){
        Suit = "spades";
    }
    
    System.out.println("You picked the " + Rank + " of " + Suit + ".");
    
   
}//end of main method

        
        
        
        
        
        
        
        
    }//end of class
