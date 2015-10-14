/*
Megan Olivola
hw 07 - Twisty

this program asks user to inupt a length and width and then creates a helix pattern across the screen.

October 9 2015 */

import java.util.Scanner; //import my scanner
//create a class
public class Twisty {
    //create main method
      public static void main(String[] args){
          Scanner MyScanner = new Scanner(System.in); //now you can prompt user for input
          int Length = 0; //create my length, which is the horizontal distance across the screen
        do{
            System.out.print("Enter your desired length: "); //ask user for input
            while (!MyScanner.hasNextInt()) { //if the input is not an int
                String input = MyScanner.next(); //look at the next input
                System.out.printf("Error: please type in an integer. ", input); //and print out this statement
                }
             int input = MyScanner.nextInt(); //look at next input
            while(input<0) { //if the input is less than zero
                System.out.printf("Error: please only enter postive numbers. \n", input); //print this out
                break;
                }
            while(input>80) { //if the input is less than zero
                System.out.printf("Error: please only enter a length less than or equal to 80. \n", input); //print this out
                break;
                }
            Length = input; //Parameter is the first valid input
        } while (Length < 0 || Length>80); //this will continue to run until Parameter is a valid input 
        
        int Width = 0; //create my widtb, which is the vertical distance across the screen
        do{
            System.out.print("Enter your desired width: "); //ask user for input
            while (!MyScanner.hasNextInt()) { //if the input is not an int
                String input = MyScanner.next(); //look at the next input
                System.out.printf("Error: please type in an integer. ", input); //and print out this statement
                }
            int input = MyScanner.nextInt(); //look at next input
            while(input<0) { //if the input is less than zero
                System.out.printf("Error: please only enter postive numbers. \n", input); //print this out
                break;
                }
            while(input>Length) { //if the input is less than zero
                System.out.printf("Error: please input an integer smaller than the length. \n", input); //print this out
                break;
                }
            Width = input; //Parameter is the first valid input
        } while (Width>Length || Width < 0); //this will continue to run until Parameter is a valid input
        
        
        for(int i = 0; i < Width; i++){
            System.out.println(""); //this will print out a new line for each width entered
            //the pattern is that for odd numbers, number*Width+/- i will yield my slashes
            //even numbers, number*Width+/- i will yield #
            for(int j = 0; j < Length; j++){
              //this part will tell the computer what to print in the horizontal areas  
                //forward slashes
                if (j%Width == Width - (i+1)){  //if the spot in the line is equal to a forward slash
                  if (Width%2==1) { //and if it's an odd numbered vertical height
                    if(j%2==i%2){ //if length and width are in phase
                     System.out.print("/"); //print the slasth
                    }
                    else {
                        System.out.print("#"); //otherwise print #
                    }
                }
                 else { //if it's an even height
                    if((j/Width)%2 == 0) { //and the spot in the line is where a forward slash should be
                        System.out.print("/"); //print the forward slash
                    }
                    else { //if it's where the hashtag whould be
                        System.out.print("#"); //print the hashtag 
                    }
                 }
                }
                //back slashes
                else if (j%(2*Width)==(Width+i)){ //mod j by 2 times the height because that's how often
                //the symbol occurs in each line.  if it equals width+i
                    System.out.print("\\"); //print the back slash
                }
                else if (j%(2*Width)==i){ 
                    System.out.print("#"); //otherwise print the forward slash
                }
             else { //if you're not printing a slash or hashtag
                 System.out.print(" "); //print a space
             }
         }//end of inner for loop
        }//end of outer for loop
            
        System.out.println(" "); //adding an extra space
        
          
          
          
      }//end of main method
}//end of class