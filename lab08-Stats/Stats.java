/*  Megan Olivola
lab 08- Stats
this program takes an input of 5 numbers and will output the mean and median
October 16, 2015
*/

import java.util.Scanner; //import scanner

public class Stats{ //create class
    //create main method
    public static void main(String[] args){
        //ask user to input 5 doubles
        Scanner MyScanner = new Scanner(System.in); //now you can prompt user for input
        double num1, num2, num3, num4, num5; //declare that inputs will be doubles
        System.out.print("Enter the first number: "); //ask user for input
        num1=MyScanner.nextDouble(); //store it as num1
        //enter second number
        do{
            System.out.print("Enter the second number: "); //ask user for input
            num2=MyScanner.nextDouble(); //store it as num1
            if (num2<num1) {
                System.out.print("ERROR: please input a number larger than the last one entered. \n"); //print error message if it's smaller than num1
            }
        }  while (num2<num1); //this will continue to run until entered number is a valid input 
        //enter third number
        do{
            System.out.print("Enter the third number: "); //ask user for input
            num3=MyScanner.nextDouble(); //store it as num1
            if (num3<num2) {
                System.out.print("ERROR: please input a number larger than the last one entered. \n"); //print error message
            }
            
        }  while (num3<num2); //this will continue to run until entered number is a valid input 
        do{
            System.out.print("Enter the fourth number: "); //ask user for input
            num4=MyScanner.nextDouble(); //store it as num1
            if (num4<num3) {
                System.out.print("ERROR: please input a number larger than the last one entered. \n"); //print error message
            }
            
        }  while (num4<num3); //this will continue to run until entered number is a valid input 
        do{
            System.out.print("Enter the fifth number: "); //ask user for input
            num5=MyScanner.nextDouble(); //store it as num1
            if (num5<num4) {
                System.out.print("ERROR: please input a number larger than the last one entered. \n"); //print error message
            }
            
        }  while (num5<num4); //this will continue to run until entered numbet is a valid input 
        double mean=Mean(num1,num2,num3,num4,num5); //call my method Mean to calculate the mean
        double median=Median(num1,num2,num3,num4,num5); //call my method Median to calculate the median
        Print(mean,median); //call my method print to print the median and mean
        
    } //end of main method
    //create methods
    //mean method
    public static double Mean(double num1, double num2, double num3, double num4, double num5){ //this method
    //returns a double and needs 5 inputs that are doubles
        double mean = ((num1+num2+num3+num4+num5)/5.0); //calculate mean
        return mean; //store whatever was calculated back in main program
    } //end of mean method
    
    //median method
    public static double Median(double num1, double num2, double num3, double num4, double num5){ //this method
    //returns a double and needs 5 inputs that are doubles
        double median = num3; //calculate median
        return median; //store what was calculated back in main program
    }//end of median method
    
    //print method
    public static void Print(double mean, double median){ //this method doesn't return anything
    //but needs two double inputs
        System.out.println("The mean is " + mean);
        System.out.println("The median is " + median); //and prints out these two statements.
        return;
    }//end of print method
    
} //end of class
        