/*
Megan Olivola
lab 10 - array practice
this program will ask user to input up to 10 student names, and then generates
a midterm grade for those students.
October 30, 2015 */

import java.util.Scanner; //import scanner

public class Arrays { //public class
    //create main method
    public static void main(String [] args){
        Scanner MyScanner = new Scanner (System.in); //create scanner
         int NumStudents=(int)(Math.random()*(5))+5; //create the amount you want for the array
         String [] Students; //declare the array
         int [] Grades; //declare grade arrays
         Students = new String [NumStudents];
         Grades = new int [NumStudents];
         System.out.println("Enter the names of "+ NumStudents + " students: "); //prompt user
         for (int i=0; i<NumStudents ; i++) {
             Students[i] = MyScanner.nextLine();
             Grades [i] = (int)(Math.random()*(101));
         }
         System.out.println("The midterm grades for the " + NumStudents + " students above are: ");
         for (int j = 0; j<NumStudents; j++){
             System.out.print(Students[j] + " : ");
             System.out.print(Grades[j] + "\n");
         }
         
         
        
    }
}