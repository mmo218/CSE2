/*Megan Olivola
hw 11 - CSE2Linear
This program asks a user to input 15 final grades and then searches for a grade.
November 10, 2015 */

import java.util.Scanner; //import scanner method

//create public class
public class CSE2Linear {
    //create main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //create scanner called scan
        int[] grades = new int [15]; //create an array for the grades to be inputted 
        System.out.print("Enter 15 ints for final grades in CSE2: "); //prompt user
        grades[0]=getgrade(scan);
       for (int i=1; i<15 ; i++) {
             grades[i] = getgrade(scan); //call getgrade method with input from scanner
             while (grades[i]<grades[i-1]){
                 System.out.println("Error.  Please enter a number larger than the last one entered.");
                 grades[i] = getgrade(scan);
             }
        }
        System.out.print("The inputted grades:  ");
        printArray(grades); //call method printArray that prints the grades
        int search; //declare search
        System.out.print("Enter a grade to search for: ");
        search = scan.nextInt();
    for (int j=0; j<15; j++) {
        if (search==grades[j] ){ //if the value is found 
            System.out.print(search + " was found with " + (j+1) + " iterations.\n");
            break;
        }
        else if(search<grades[j]){ //if you're already past where it would be
            System.out.print(search + " was not found with " + (j+1) + " iterations.\n");
            break;
        }
        else if (j==14) { //if you've gotten here that means it wasn't found :(
            System.out.print(search + " was not found with " + (j+1) + " iterations.\n");
        }
    }
    //time to scramble my array
    shuffle(grades); //use shuffle method
    System.out.println("Scrambled: ");
    printArray(grades);
    System.out.print("Enter a new grade to search for: ");
    search = scan.nextInt();
      for (int j=0; j<15; j++) {
        if (search==grades[j] ){ //if the value is found 
            System.out.print(search + " was found with " + (j+1) + " iterations.\n");
            break;
        }
        else if (j==14) { //if you've gotten here that means it wasn't found :(
            System.out.print(search + " was not found with " + (j+1) + " iterations.\n");
        }
        
        
    }
    } //end of main method
    
//getgrade method will ensure integer input between 0 and 100    
public static int getgrade (Scanner in){  
    //first check that the input is an int
     int grade = -1;
     do{
            while (!in.hasNextInt()) { //if the input is not an int
                String input = in.next(); //look at the next input
                System.out.printf("Error: please type in an integer. ", input); //and print out this statement
                }
            int input = in.nextInt(); //look at next input
            while(input<0 || input>100) { //if the input is less than zero
                System.out.printf("Error: please only enter numbers. Between 0 and 100 \n", input); //print this out
                break;
                }
            /*while(input>) { //if the input is less than zero
                System.out.printf("Error: please input an integer smaller than the length. \n", input); //print this out
                break;
                }*/
            grade = input; //Parameter is the first valid input
        } while (grade<0 || grade>100); //this will continue to run until Parameter is a valid input
    return grade;
}

//method printArray will print out the array
public static void printArray(int [] grades){
    for (int j=0; j<grades.length; j++){
        System.out.print(grades[j]+" "); //print out each grade with a space after
    }
    System.out.println(""); //add a space
    return; //and return back to the main program
}//end of printArray method

//shuffle method
public static int [] shuffle(int[]grades){
    for (int k=0; k<25; k++){
        int destination = (int)(Math.random()*15); //figure out which card to pick
        int temp = grades[0]; //create a temp number
        grades[0] = grades[destination]; //switch the values
        grades[destination] = temp;
        }
    return grades;
} //end of shuffle method
    
} //end of class