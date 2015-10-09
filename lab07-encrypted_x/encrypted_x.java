/*
Megan Olivola
lab 07 - encrypted x
This program takes a value from 0-100
and creates an encrypted x with stars
October 9 2015 */

import java.util.Scanner; //import my scanner
//create a class
public class encrypted_x {
    //create main method
      public static void main(String[] args){
          Scanner MyScanner = new Scanner(System.in); //now you can prompt user for input
          int Parameter = 0; //create my parameter variable
        do{
            System.out.print("Enter an integer between 0 and 100: "); //ask user for input
            while (!MyScanner.hasNextInt()) { //if the input is not an int
                String input = MyScanner.next(); //look at the next input
                System.out.printf("Sorry, you did not enter an integer. Try Again: ", input); //and print out this statement
                }
             int input = MyScanner.nextInt(); //look at next input
            while(input<0) { //if the input is less than zero
                System.out.printf("Please only enter postive numbers.  Try Again. \n", input); //print this out
                break;
                }
            while(input>100){ //if input is greater than 100
                System.out.printf("Please only enter numbers less than 100.  Try Again. \n", input); //print this out
                break;
                }    
            Parameter = input; //Parameter is the first valid input
        } while (Parameter < 0 || Parameter > 100); //this will continue to run until Parameter is a valid input
        
        for(int i = 0; i < Parameter; i++){
            System.out.println("");
            for(int j = 0; j < Parameter; j++){
                if(j == i || j == (Parameter-(i+1))){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            
        }
        System.out.println("");
          
          
          
      }//end of main method
}//end of class