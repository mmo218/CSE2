//////////////////////////////////
//Megan Olivola
//Lab 03 - Check
// 9/11/2015


//import the scanner
import java.util.Scanner;

//define a class
public class Check  {
        // main method required for every Java program
       public static void main(String[] args) {
       
       Scanner myScanner = new Scanner (System.in); //you can prompt a user to enter data
       System.out.print ("Enter the original cost of the check in the form xx.xx: "); //prompt user for check cost
       double checkCost = myScanner.nextDouble(); //take the input and convert it to a double
       System.out.print ("Enter the percentage tip that you wish to pay as a whole number in the form xx: "); //prompt user for the tip they wish to pay
       double tipPercent = myScanner.nextDouble(); //convert input to a double
       tipPercent /= 100; //We want to convert the percentage into a decimal value
       System.out.print("Enter the number of people who went out to dinner: "); //prompt user for number of guests
       int numPeople = myScanner.nextInt(); //convert the number of people to an integer
       double totalCost; //create a variable called totalCost
       double costPerPerson; //create a variable called costPerPerson
       int dollars,   //whole dollar amount of cost 
                dimes, pennies; //for storing digits
                    //to the right of the decimal point 
                   //for the cost$ 
       totalCost = checkCost * (1 + tipPercent); //calculate the total cost including tip
       costPerPerson = totalCost / numPeople;
            //get the whole amount, dropping decimal fraction
       dollars=(int)costPerPerson;
            //get dimes amount, e.g., 
            // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
            //  where the % (mod) operator returns the remainder
            //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
        
       } //end of main method
       
}//end of class



