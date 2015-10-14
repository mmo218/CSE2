/*
Megan Olivola
hw 07 - Twisty

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
        
        
   // if (Width%2 == 1){
      /*  for(int i=0; i<Width; i++){
            System.out.println("");
            for(int j=0; j<Length; j++){
                for (int k=0; k<Length; k++){
                if (j%Length == k && i%Width== k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
            }
        }*/
   /* }
    else{
        for(int i=0; i<Width; i++){
            System.out.println("");
            for(int j=0; j<Length; j++){
              for (int k=0; k<Length; k++){
                if (j%Length == k && i%Width== k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
            }
        }
        
    }
        */
        
        
        for(int i = 0; i < Width; i++){
            System.out.println(""); //this will print out a new line for each width entered
            //the pattern is that for odd numbers, number*Width+/- i will yield my slashes
            //even numbers, number*Width+/- i will yield #
            for(int j = 0; j < Length; j++){
                    if(j==(Width-i) || j==(3*Width-i) || j==(5*Width-i) || j==(7*Width-i)){ //pattern for forward slashes
                     System.out.print("/");
                    }
                    else if (j==(Width+i) || j==(3*Width+i) || j==(5*Width+i) || j==(7*Width+i)){ //pattern for back slashes
                    System.out.print("\\");
                    }
                    else if (j==i || j==(2*Width-i) || j==(2*Width+i) || j==(4*Width-i) || j==(4*Width+i)){ //print hashtag
                    System.out.print("#");
                    }
                    else{
                    System.out.print(" ");
                     }
                }
        }
            
        System.out.println(" ");
        
          
          
          
      }//end of main method
}//end of class