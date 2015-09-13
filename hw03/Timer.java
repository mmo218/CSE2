//////////////////////////////////
//Megan Olivola
//hw 03 - Program 1  - Timer
// 9/15/2015


//import the scanner
import java.util.Scanner;

//define a class
public class Timer {
        // main method required for every Java program
       public static void main(String[] args) {
       
       Scanner myScanner = new Scanner (System.in); //you can prompt a user to enter data
       System.out.print ("Enter the current time: "); //prompt user for the current time
       int CurrentTime = myScanner.nextInt(); //take the input and convert it to a double
       System.out.print ("Enter the time you will be eating dinner: "); //prompt user for the time they will be eating
       int DinnerTime = myScanner.nextInt(); //convert input to a double
       int TimeRemaining = DinnerTime-CurrentTime; //calculate when the user will be eating dinner
       //the time remaining will be in the form HMM
       int Hours = (int) (TimeRemaining/100); //calculate the hours
       int Minutes = TimeRemaining - (Hours*100); //calculate the minutes
       System.out.println("You have " +Hours+" hours and "+Minutes+" minutes until dinner."); //print the time until dinner
       
       } //end of main method
       
}//end of class
       
       