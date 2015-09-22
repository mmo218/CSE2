///////////////////////
//Megan Olivola
//hw 04 - Poker Hand Check
//due 9/22/2015

//import java.util.Scanner; //used the scanner to check my work and just commented it out

//define a class
public class PokerHandCheck  {
    //define a main method - necessary for all Java programs
    public static void main(String[] args){
        //generate a number for the first card
        int RandomCard1=(int)(Math.random()*(53))+1;
        //used scanner to check work
        //Scanner myScanner = new Scanner (System.in); //you can prompt a user to enter data
        //System.out.print ("Enter the first card: "); //prompt user for the first card
        //int RandomCard1 = myScanner.nextInt(); //take the input and convert it to a int
        System.out.println("1st Card = " + RandomCard1); //used this to print out the number to check if the card assignment was right
        
        String Rank1 = ""; //create a variable for the rank
        
        switch( RandomCard1%13 ){
            //Use the modulus function on the Card number which will leave you with a number 1-13
            //I used a switch and assigned the different numbers 1-13 to a designated card like "Ace" and 2-10 and the face cards
            //whichever number corresponds to the rank is saved as Rank1 for this card
            case 1:
                Rank1 = "Ace";
                break;
             case 2:
                Rank1 = "2";
                break;
             case 3:
                Rank1 = "3";
                break;
             case 4:
                Rank1 = "4";
                break;
             case 5:
                Rank1 = "5";
                break;
             case 6:
                Rank1 = "6";
                break;
             case 7:
                Rank1 = "7";
                break;
             case 8:
                Rank1 = "8";
                break;
             case 9:
                Rank1 = "9";
                break;
             case 10:
                Rank1 = "10";
                break;
             case 11:
                Rank1 = "Jack";
                break;
            case 12:
                Rank1= "Queen";
                break;
            case 13:
                Rank1 = "King";
                break;
        }
    
    //define the suit
    
    String Suit1 = ""; //define a variable for the suit
    
    if (RandomCard1>=1 && RandomCard1<=13){
        Suit1 = "diamonds";
        //the suit for the first 13 cards is diamonds
    }
    else if (14<=RandomCard1 && RandomCard1<=26){
        Suit1 = "clubs";
        //the suit for the second 13 cards is clubs
    }
    
    else if (27<=RandomCard1 && RandomCard1<=39){
        Suit1 = "hearts";
        //the suit for the third 13 cards is hearts
    }
    else if (40<=RandomCard1 && RandomCard1<=52){
        Suit1 = "spades";
        //the suit for the fourth 13 cards is spades
    }
    
    //my process is repeated for the next 4 cards:
    //use the Math.random function to get a number 1-52 for a card
    //use a switch and mod the number you got by 13 to define rank
    //use if statements to define the number by suit
      
      
    //second card  
    int RandomCard2=(int)(Math.random()*(53))+1;
    //used Scanner to check work
    //System.out.print ("Enter the second card: "); //prompt user for the first card
    //int RandomCard2 = myScanner.nextInt(); //take the input and convert it to a int
    System.out.println("2nd Card = " + RandomCard2);
        
    //define rank    
    String Rank2 = "";
        
    switch( RandomCard2%13 ){
        case 1:
            Rank2 = "Ace";
            break;
         case 2:
            Rank2 = "2";
            break;
         case 3:
            Rank2 = "3";
            break;
         case 4:
            Rank2 = "4";
            break;
         case 5:
            Rank2 = "5";
            break;
         case 6:
            Rank2 = "6";
            break;
         case 7:
            Rank2 = "7";
            break;
         case 8:
            Rank2 = "8";
            break;
         case 9:
            Rank2 = "9";
            break;
         case 10:
            Rank2 = "10";
            break;
         case 11:
            Rank2 = "Jack";
            break;
        case 12:
            Rank2= "Queen";
            break;
        case 13:
            Rank2 = "King";
            break;
            }
    
    //define the suit
    
    String Suit2 = "";
    
    if (RandomCard2>=1 && RandomCard2<=13){
        Suit2 = "diamonds";
        
    }
    else if (14<=RandomCard2 && RandomCard2<=26){
        Suit2 = "clubs";
    }
    
    else if (27<=RandomCard2 && RandomCard2<=39){
        Suit2 = "hearts";
    }
    else if (40<=RandomCard2 && RandomCard2<=52){
        Suit2 = "spades";
    }
    
    //third card
        int RandomCard3=(int)(Math.random()*(53))+1;
        //used scanner to check work
        //System.out.print ("Enter the third card: "); //prompt user for the first card
        //int RandomCard3 = myScanner.nextInt(); //take the input and convert it to a int
        System.out.println("3rd Card = " + RandomCard3);
      
      //define rank 
       
        String Rank3 = "";
        
    switch( RandomCard3%13 ){
        case 1:
            Rank3 = "Ace";
            break;
         case 2:
            Rank3 = "2";
            break;
         case 3:
            Rank3 = "3";
            break;
         case 4:
            Rank3 = "4";
            break;
         case 5:
            Rank3 = "5";
            break;
         case 6:
            Rank3 = "6";
            break;
         case 7:
            Rank3 = "7";
            break;
         case 8:
            Rank3 = "8";
            break;
         case 9:
            Rank3 = "9";
            break;
         case 10:
            Rank3 = "10";
            break;
         case 11:
            Rank3 = "Jack";
            break;
        case 12:
            Rank3= "Queen";
            break;
        case 13:
            Rank3 = "King";
            break;
            }
    
    //define the suit
    
    String Suit3 = "";
    
    if (RandomCard3>=1 && RandomCard3<=13){
        Suit3 = "diamonds";
        
    }
    else if (14<=RandomCard3 && RandomCard3<=26){
        Suit3 = "clubs";
    }
    
    else if (27<=RandomCard3 && RandomCard3<=39){
        Suit3 = "hearts";
    }
    else if (40<=RandomCard3 && RandomCard3<=52){
        Suit3 = "spades";
    }
    
    //fourth card
        int RandomCard4=(int)(Math.random()*(53))+1;
        //used scanner to check work
       // System.out.print ("Enter the fourth card: "); //prompt user for the first card 
       //int RandomCard4 = myScanner.nextInt(); //take the input and convert it to a int
        System.out.println("4th Card = " + RandomCard4);
      
    //define rank  
        String Rank4 = "";
        
    switch( RandomCard4%13 ){
        case 1:
            Rank4 = "Ace";
            break;
         case 2:
            Rank4 = "2";
            break;
         case 3:
            Rank4 = "3";
            break;
         case 4:
            Rank4 = "4";
            break;
         case 5:
            Rank4 = "5";
            break;
         case 6:
            Rank4 = "6";
            break;
         case 7:
            Rank4 = "7";
            break;
         case 8:
            Rank4 = "8";
            break;
         case 9:
            Rank4 = "9";
            break;
         case 10:
            Rank4 = "10";
            break;
         case 11:
            Rank4 = "Jack";
            break;
        case 12:
            Rank4= "Queen";
            break;
        case 13:
            Rank4 = "King";
            break;
            }
    
    //define the suit
    
    String Suit4 = "";
    
    if (RandomCard4>=1 && RandomCard4<=13){
        Suit4 = "diamonds";
        
    }
    else if (14<=RandomCard4 && RandomCard4<=26){
        Suit4 = "clubs";
    }
    
    else if (27<=RandomCard4 && RandomCard4<=39){
        Suit4 = "hearts";
    }
    else if (40<=RandomCard4 && RandomCard4<=52){
        Suit4 = "spades";
    }
    
    //fifth card
    
    int RandomCard5=(int)(Math.random()*(53))+1;
    //used scanner to check work
    //System.out.print ("Enter the fifth card: "); //prompt user for the first card
       //int RandomCard5 = myScanner.nextInt(); //take the input and convert it to a int
    System.out.println("5th Card = " + RandomCard5);
      
     //define rank
        
    String Rank5 = "";
        
    switch( RandomCard5%13 ){
        case 1:
            Rank5 = "Ace";
            break;
         case 2:
            Rank5 = "2";
            break;
         case 3:
            Rank5 = "3";
            break;
         case 4:
            Rank5 = "4";
            break;
         case 5:
            Rank5 = "5";
            break;
         case 6:
            Rank5 = "6";
            break;
         case 7:
            Rank5 = "7";
            break;
         case 8:
            Rank5 = "8";
            break;
         case 9:
            Rank5 = "9";
            break;
         case 10:
            Rank5 = "10";
            break;
         case 11:
            Rank5 = "Jack";
            break;
        case 12:
            Rank5= "Queen";
            break;
        case 13:
            Rank5 = "King";
            break;
            }
    
    //define the suit
    
    String Suit5 = "";
    
    if (RandomCard5>=1 && RandomCard5<=13){
        Suit5 = "diamonds";
        
    }
    else if (14<=RandomCard5 && RandomCard5<=26){
        Suit5 = "clubs";
    }
    
    else if (27<=RandomCard5 && RandomCard5<=39){
        Suit5 = "hearts";
    }
    else if (40<=RandomCard5 && RandomCard5<=52){
        Suit5 = "spades";
    }
    //Now I have my hand
    //Now i'm going to print out the results of my randomly drawn hand
    
    System.out.println("Your random cards were:  ") ;
    System.out.println("the "+ Rank1 + " of " + Suit1);
    System.out.println("the "+ Rank2 + " of " + Suit2);
    System.out.println("the "+ Rank3 + " of " + Suit3);
    System.out.println("the "+ Rank4 + " of " + Suit4);
    System.out.println("the "+ Rank5 + " of " + Suit5);
    System.out.println(""); //space
    //now if the ranks are the same, that means you have a pair, two pair, or three of a kind, or high hand
    
    //use boolean for three of a kind
    boolean ThreeOfAKind = (((Rank1).equals(Rank2) && (Rank2).equals(Rank3))||((Rank1).equals(Rank2) && (Rank2).equals(Rank4))
    ||((Rank1).equals(Rank2) && (Rank2).equals(Rank5))||((Rank1).equals(Rank3) && (Rank3).equals(Rank4))||
    ((Rank1).equals(Rank3) && (Rank3).equals(Rank5))||((Rank1).equals(Rank4) && (Rank4).equals(Rank5))||
    ((Rank2).equals(Rank3) && (Rank3).equals(Rank4))||((Rank2).equals(Rank4) && (Rank4).equals(Rank5))||
    ((Rank3).equals(Rank4) && (Rank4).equals(Rank5))); //all possible combinations
    //if one combo is right, ThreeOfAKind=true, otherwise it =false
    
    //use boolean for pairs
    boolean Pair = (((Rank1).equals(Rank2)) || ((Rank1).equals(Rank3)) || ((Rank1).equals(Rank4)) || ((Rank1).equals(Rank5))||
    ((Rank2).equals(Rank3)) || ((Rank2).equals(Rank4)) || ((Rank2).equals(Rank5))||((Rank3).equals(Rank4)) || ((Rank3).equals(Rank5))||
    ((Rank4).equals(Rank5))); //all possible combinations
    //if one combination is right, Pair=true , none right = false
    
    //use boolean for two pairs
    boolean TwoPair = ((((Rank1).equals(Rank2))&&((Rank3).equals(Rank4)))||(((Rank1).equals(Rank2))&&((Rank3).equals(Rank5)))||
    (((Rank1).equals(Rank2))&&((Rank4).equals(Rank5)))||(((Rank1).equals(Rank3))&&((Rank2).equals(Rank4)))||
    (((Rank1).equals(Rank3))&&((Rank2).equals(Rank5)))||(((Rank1).equals(Rank3))&&((Rank4).equals(Rank5)))||
    (((Rank1).equals(Rank4))&&((Rank2).equals(Rank3)))||(((Rank1).equals(Rank4))&&((Rank2).equals(Rank5)))||
    (((Rank1).equals(Rank4))&&((Rank3).equals(Rank5)))||(((Rank1).equals(Rank5))&&((Rank2).equals(Rank3)))||
    (((Rank1).equals(Rank5))&&((Rank2).equals(Rank4)))||(((Rank1).equals(Rank5))&&((Rank3).equals(Rank4)))||
    (((Rank2).equals(Rank3))&&((Rank4).equals(Rank5)))||(((Rank2).equals(Rank4))&&((Rank3).equals(Rank5)))||
    (((Rank2).equals(Rank5))&&((Rank3).equals(Rank4)))); //all possible combinations  
    //if one is correct, TwoPair=true , if none right = false
    
    //use boolean for three of a kind and pair
    boolean ThreeAndPair = ((((Rank1).equals(Rank2)) && ((Rank2).equals(Rank3)) && ((Rank4).equals(Rank5))) || (((Rank1).equals(Rank2)) && ((Rank2).equals(Rank4)) && ((Rank3).equals(Rank5))) || 
    (((Rank1).equals(Rank2)) && ((Rank2).equals(Rank5)) && ((Rank3).equals(Rank4))) || (((Rank1).equals(Rank3)) && ((Rank3).equals(Rank4)) && ((Rank2).equals(Rank5))) || 
    (((Rank1).equals(Rank3)) && ((Rank3).equals(Rank5)) && ((Rank2).equals(Rank4))) || (((Rank1).equals(Rank4)) && ((Rank4).equals(Rank5)) && ((Rank2).equals(Rank3))) || 
    (((Rank2).equals(Rank3)) && ((Rank3).equals(Rank4)) && ((Rank1).equals(Rank5))) || (((Rank2).equals(Rank4)) && ((Rank4).equals(Rank5)) && ((Rank1).equals(Rank3))) || 
    (((Rank3).equals(Rank4)) && ((Rank4).equals(Rank5)) && ((Rank1).equals(Rank2)))); //all possible combinations
    //if one combo is right, ThreeOfAKind=true, otherwise it =false
    
    if (ThreeOfAKind==true) { //if you have three of a kind
        if (ThreeAndPair==true){ //look to see if you have a pair also
            System.out.println("You have three of a kind and a pair!"); //if you do, print that you have both
        }
        else {
            System.out.println("You have three of a kind!"); //if you don't also have a pair, print that you have three of a kind
        }
    }
    
    else if (Pair==true){ //if you don't have three of a kind, check if you have a pair
        
        if(TwoPair==true){ //if you do, check to see if you have another pair
            System.out.println("You have two pairs!"); //if you do, print that you have two pairs
        } 
        else{
            System.out.println("You have a pair!"); //if you only have one pair, print that
        }
    }
    else { //if you don't have either three of a kind or a pair
        System.out.println("You have a high card hand!"); //you have a high card hand (print that)
    }
    
        
    }//end of main method
}//end of class