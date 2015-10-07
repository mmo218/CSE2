/*
Megan Olivola
hw06 - BarGraph
This program takes a students spending throughout the week and tells you your average daily spending,
as well as create a bar graph that shows you how much you're spending.  It also gives you
an estimate of what your spending might be over the next 4 years, assuming your spending fluctuates
up or down 20% each week based off of the week entered.
due October 6th, 2015 */

import java.util.Scanner; //import a scanner to my program
//create a class
public class BarGraph {
    //main method
    public static void main(String[] args){
        
        Scanner Scan = new Scanner(System.in); //my scanner is named Scan
       double Monday = 0; //create a double named Monday
       do {
            System.out.print("Expenses for Monday: $"); //prompt user for input
            while (!Scan.hasNextDouble()) { //if the input is not a double
                String input = Scan.next(); //look at the next input
                System.out.printf("Sorry, you did not enter an integer. Try Again: $", input); //and print out this statement
                }
             double input = Scan.nextDouble(); //look at next input
            while(input<0) { //if the input is less than zero
                System.out.printf("Please only enter postive numbers.  Try Again. \n", input); //print this out
                break;
                }
            Monday = input; //Monday is the first valid input
        } while (Monday < 0); //this will continue to run until Monday is a valid input
        
        //samae process as above
        double Tuesday = 0; 
       do {
            System.out.print("Expenses for Tuesday: $"); 
            while (!Scan.hasNextDouble()) { 
                String input = Scan.next(); 
                System.out.printf("Sorry, you did not enter an integer. Try Again: $", input); 
                }
             double input = Scan.nextDouble(); 
            while(input<0) { 
                System.out.printf("Please only enter postive numbers.  Try Again.  \n", input); 
                break;
                }
            Tuesday = input; 
        } while (Tuesday < 0); 
        
          double Wednesday = 0; 
       do {
            System.out.print("Expenses for Wednesday: $"); 
            while (!Scan.hasNextDouble()) { 
                String input = Scan.next(); 
                System.out.printf("Sorry, you did not enter an integer. Try Again: $", input); 
                }
             double input = Scan.nextDouble(); 
            while(input<0) { 
                System.out.printf("Please only enter postive numbers.  Try Again. \n", input); 
                break;
                }
            Wednesday = input; 
        } while (Wednesday < 0); 
        
          double Thursday = 0; 
       do {
            System.out.print("Expenses for Thursday: $"); 
            while (!Scan.hasNextDouble()) { 
                String input = Scan.next(); 
                System.out.printf("Sorry, you did not enter an integer. Try Again. \n", input); 
                }
             double input = Scan.nextDouble(); 
            while(input<0) { 
                System.out.printf("Please only enter postive numbers.  Try Again. \n", input); 
                break;
                }
            Thursday = input; 
        } while (Thursday < 0); 
        
          double Friday = 0; 
       do {
            System.out.print("Expenses for Friday: $"); 
            while (!Scan.hasNextDouble()) { 
                String input = Scan.next(); 
                System.out.printf("Sorry, you did not enter an integer. Try Again: $", input); 
                }
             double input = Scan.nextDouble(); 
            while(input<0) { 
                System.out.printf("Please only enter postive numbers.  Try Again. \n", input); 
                break;
                }
            Friday = input; 
        } while (Friday < 0); 
        
          double Saturday = 0; 
       do {
            System.out.print("Expenses for Saturday: $"); 
            while (!Scan.hasNextDouble()) { 
                String input = Scan.next(); 
                System.out.printf("Sorry, you did not enter an integer. Try Again: $", input); 
                }
             double input = Scan.nextDouble(); 
            while(input<0) { 
                System.out.printf("Please only enter postive numbers.  Try Again. \n", input); 
                break;
                }
            Saturday = input; 
        } while (Saturday < 0); 
        
          double Sunday = 0; 
       do {
            System.out.print("Expenses for Sunday: $"); 
            while (!Scan.hasNextDouble()) { 
                String input = Scan.next(); 
                System.out.printf("Sorry, you did not enter an integer. Try Again: $", input); 
                }
             double input = Scan.nextDouble(); 
            while(input<0) { 
                System.out.printf("Please only enter postive numbers.  Try Again. \n", input); 
                break;
                }
            Sunday = input; 
        } while (Sunday < 0); 
        double TotalWeek = Monday + Tuesday + Wednesday + Thursday + Friday + Saturday + Sunday ; //the amount spent for the entire week
        double AverageDay = TotalWeek/7 ; //the average expenses for the week
        
        
        //to determine if I should round down or round up
        int mondayR = (int) Math.round(Monday); //use the Math.round function to round up or down
        int tuesdayR = (int) Math.round(Tuesday);
        int wednesdayR =(int) Math.round(Wednesday);
        int thursdayR = (int) Math.round(Thursday);
        int fridayR = (int) Math.round(Friday);
        int saturdayR = (int) Math.round(Saturday);
        int sundayR = (int) Math.round(Sunday);
        
        
        //to print the bar graph, compare a number to the new rounded variable
        //keep increasing; each increase is another asterisk
        int number1 = 1;
        while (number1 <= mondayR){
            System.out.print("*");
             number1++;
        }
       
        System.out.println("");
        
        int number2 = 1;
        while (number2 <= tuesdayR){
            System.out.print("*");
             number2++;
        }
        
        System.out.println("");
        
        int number3 = 1; 
        while (number3 <= wednesdayR){
            System.out.print("*");
             number3++;
        }
        
        System.out.println("");
        
        int number4 = 1; 
        while (number4 <= thursdayR){
            System.out.print("*");
             number4++;
        }
        
        System.out.println("");
        
        int number5 = 1 ;
        while (number5 <= fridayR){
            System.out.print("*");
             number5++;
        }
        
        System.out.println("");
        
        int number6 = 1 ;
        while (number6 <= saturdayR){
            System.out.print("*");
             number6++;
        }
        
        System.out.println("");
        
        int number7 = 1 ;
        while (number7 <= sundayR){
            System.out.print("*");
             number7++;
        }
        
        System.out.println("");
        
        System.out.printf("Your average daily expenses are: $" + "%.2f", AverageDay); //print out the average expenses for the week
        System.out.println("");
        
        //to figure out my expenses for the year, assuming there is a fluctuation of +20% to -20%
        int Week = 1;
        int FourYears = (52*4)-1; //subtract one because the week entered is the first week
        double FourYearSpending = 0;
        double WeekSpending; 
        while (Week <= (FourYears)) {
            double Variation = (double)((Math.random()*(41))+1) - 20; //create a random number between 1 and 40, then subtract
            //20 to get a number between negative 20 and postive 20
            WeekSpending = TotalWeek*(1 + (Variation/100)); //the spending for that week is 1.x * week calculated
            FourYearSpending = FourYearSpending + WeekSpending; //add the calculated week spending to the spending so far
            //for that year
            Week++;//increment the week by one
            //repeat until all 208 weeks have been found and added to the spending for 4 years
            
        }
        
        FourYearSpending = FourYearSpending + TotalWeek; //add back in the past week
        
        System.out.printf("Estimated expenditure for 4 years: $" +"%.2f",FourYearSpending);
        System.out.println("");
    }//end of main method
} //end of class
