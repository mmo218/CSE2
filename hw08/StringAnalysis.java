/* Megan Olivola
hw08 - String analysis
This program will take an input of a string and will determine if each input
is a letter or not.
October 20, 2015 */

import java.util.Scanner; //import scanner

//create a class
public class StringAnalysis{
    //create main method
    public static void main(String[] args){
        Scanner MyScanner = new Scanner(System.in);
        String input = ""; //declare string
        System.out.print("Enter a string: "); //prompt user for input
        input = MyScanner.nextLine();
        System.out.print("If you want to look at a specific amount, please enter that amount. (Otherwise, type no): ");
        if (MyScanner.hasNextInt()){
               int length = 0;
               length = MyScanner.nextInt();
               boolean chars = checkchar(input, length); //take the inputs of what the user entered and the previously entered string
                if (chars == false){
                    System.out.println("Not all characters entered are letters."); //not all chars are letter
                    }
                else {
                    System.out.println("All characters entered are letters."); //all chars are letters
                    }
                    
                }
        else if (MyScanner.hasNextInt() == false){
            boolean chars = checkchar(input); //only input is the inputted string
            if (chars == false){
                    System.out.println("Not all characters entered are letters."); //not all chars are letter
                    }
                else {
                    System.out.println("All characters entered are letters."); //all chars are letters
                    }
        }
               
    } //end of main method
//create other methods
//method check char with string

public static boolean checkchar(String sentence, int total){
    
    if (total>sentence.length()){ //if the number entered is bigger than the total length
        for (int i =0; i < sentence.length(); i++) { //just compare for the whole length 
        if (Character.isLetter(sentence.charAt(i))==false){ //if it is not a letter
            return false; //return false
            }
        }
        return true; //otherwise return true
    }
    
    else { //if number entered is less than the total length
        for(int i =0; i < total; i++){ //just look at the number of characters the user wants you to look at 
        if(Character.isLetter(sentence.charAt(i))==false){ //if it not a letter 
            return false;//return false
            }
        
        return true; //otherwise return true
        }
    
    }
    return true;
    
    }//end of checkchar method
    
public static boolean checkchar(String sentence){
    for (int i =0; i < sentence.length(); i++){ //just compare for the whole length 
        if (Character.isLetter(sentence.charAt(i))==false){ //if it is not a letter
            return false; //return false
            }
        return true; //otherwise return true
    }
    return true;
} //end of checkchar method
    

}//end of class