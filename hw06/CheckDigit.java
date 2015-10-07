/*
Megan Olivola
hw06 - Check Digit
This program takes input from a user in the form of a 10-digit ISBN
number and checks to make sure it is a valid number.
due October 6th, 2015 */

import java.util.Scanner; //import a scanner to my program
//create a class
public class CheckDigit {
    //main method
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in); //my scanner is named Input
        //int counterDigit = 0;
        System.out.print("Please enter a 10 digit barcode: "); //prompt user for the barcode
           String ISBN = ""; //initialize the string for the IBSN
           
           boolean check= true; //create a boolean
           
           while(check){ //this will run at least once
               ISBN = Input.next(); //the ibsn is the inputted string
               if(ISBN.length() == 10){ //if it has 10 characters entered
                   check= false; //then the check becomes false and it will exit the loop
               }
               else{ //otherwise
                   System.out.print("Invalid ISBN.  ISBN must be 10 digits: "); //it will tell you you are wrong and ask
                   //for another input
                   //then go back to where ibsn is = the next inputted string
               }
               
           }
           //create variables for the numbers
           String Number1 = "";
           String Number2 = "";
           String Number3 = "";
           String Number4 = "";
           String Number5 = "";
           String Number6 = "";
           String Number7 = "";
           String Number8 = "";
           String Number9 = "";
           String Check="";
           //the substring method can look at a string
           //and "grab" characters from the entered string, starting at the first value
           //entered and ending at the last.  for example substring(0,1) will take the first
           //entered value.  similarly, (1,2) will take the second entered value.
           Number1 = ISBN.substring(0,1); //take the first entered value and store it as Number1
           Number2 = ISBN.substring(1,2);
           Number3 = ISBN.substring(2,3);
           Number4 = ISBN.substring(3,4);
           Number5 = ISBN.substring(4,5);
           Number6 = ISBN.substring(5,6);
           Number7 = ISBN.substring(6,7);
           Number8 = ISBN.substring(7,8);
           Number9 = ISBN.substring(8,9);
           Check=ISBN.substring(9,10);
           
           String X = "X"; //create the string X
           String x = "x"; //and x
           int CheckDigit = 0; //intialize check digit
           if ((Check).equals(X) || (Check).equals(x)){ //if the check digit is x or X
            CheckDigit = 10; //it equals 10
           }
           else {
               CheckDigit = Integer.parseInt(Check); //otherwise, convert it to an int
           }
           //convert the rest of my strings to integers
          int First = Integer.parseInt(Number1);
          int Second = Integer.parseInt(Number2);
          int Third = Integer.parseInt(Number3);
          int Fourth = Integer.parseInt(Number4);
          int Fifth = Integer.parseInt(Number5);
          int Sixth = Integer.parseInt(Number6);
          int Seventh = Integer.parseInt(Number7);
          int Eighth = Integer.parseInt(Number8);
          int Ninth = Integer.parseInt(Number9);
          
          
          int Sum = (10*First)+(9*Second)+(8*Third)+(7*Fourth)+(6*Fifth)+(5*Sixth)+
          (4*Seventh)+(3*Eighth)+(2*Ninth); //find the sum of the ints multiplied in the method
          //explained in the homework
          int Remainder = Sum%11; //mod it by 11
        int number=0; //initialize counter
        while (number<=10){ //
            if (CheckDigit == Remainder && Remainder == number){ //if the remainder equals the checkdigit, remainder equals incrementing counter
                System.out.println("This is a valid ISBN!"); //you have entered a valid IBSN
                number=11; //then exit the while loop
            }
            number++; //if it didn't equal the counter, then increment the counter to run again and check
        }
        
        if (CheckDigit != Remainder){ //if the checkdigit does not equal the remainder
            if (Remainder == 10){
                System.out.println("This is not a valid ISBN. Check digit should be X.");
            }
            else {
            System.out.println("This is not a valid ISBN. Check digit should be "+ Remainder + "."); //tell user it's
            //not a valid ISBN and tell user what the check digit should be.
            }
        }
        
    } //end of main method
    
} //end of class
