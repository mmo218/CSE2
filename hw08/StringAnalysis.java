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
        System.out.print("If you want to look at a specific amount, please enter that amount.: ");
        if (MyScanner.hasNextInt()){
               int length = 0;
               length = MyScanner.nextInt();
               boolean chars = checkchar(input, length); //take the inputs of what the user entered and the previously entered string
                if (chars == false){
                    System.out.println("Not all characters entered are letters.");
                    }
                else {
                    System.out.println("All characters entered are letters.");
                    }
                    
                }
               
           } //end of main method
//create other methods
//method check char with string

public static boolean checkchar(String sentence, int total){
    
    if (total>sentence.length()) {
        for (int i =0; i < sentence.length(); i++) {
        if (Character.isLetter(sentence.charAt(i))==false) {
            return false;
            }
        }
        return true;
    }
    
    else {
        for(int i =0; i < total; i++) {
        if(!Character.isLetter(sentence.charAt(i))==false) {
            return false;
            }
        }
        return true;
    }
    
}//end of checkchar method

}//end of class