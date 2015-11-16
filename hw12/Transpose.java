/* Megan Olivola
hw12 - Transpose
This program creates an M x N matrix and transposes it.
November 17th, 2015 */


import java.util.Scanner;
//create public class
public class Transpose {
    //create main method
    public static void main(String[] args){
        Scanner MyScanner = new Scanner(System.in);
        int height, width;
        do{
            System.out.print("Enter height: "); //ask user for input
            while (!MyScanner.hasNextInt()) { //if the input is not an int
                String input = MyScanner.next(); //look at the next input
                System.out.printf("Error: please type in an integer. ", input); //and print out this statement
                }
            int input = MyScanner.nextInt(); //look at next input
            while(input<0) { //if the input is less than zero
                System.out.printf("Error: please only enter postive numbers. \n", input); //print this out
                break;
                }
            height = input; //Parameter is the first valid input
        } while (height < 0); //this will continue to run until Parameter is a valid input
         do{
            System.out.print("Enter width: "); //ask user for input
            while (!MyScanner.hasNextInt()) { //if the input is not an int
                String input = MyScanner.next(); //look at the next input
                System.out.printf("Error: please type in an integer. ", input); //and print out this statement
                }
            int input = MyScanner.nextInt(); //look at next input
            while(input<0) { //if the input is less than zero
                System.out.printf("Error: please only enter postive numbers. \n", input); //print this out
                break;
                }
            width = input; //Parameter is the first valid input
        } while (width < 0); //this will continue to run until Parameter is a valid input
        
        int[][] random = randomMatrix(height,width); //create random mxn matrix
        System.out.println("Here is your matrix: ");
        printMatrix(random); //call printMatrix with random being the input
        int[][] randomtranspose = transposeMatrix(random,height,width);
        System.out.println("Here is your transposed matrix: ");
        printMatrix(randomtranspose);
        
    }
//create random matrix method
    public static int[][] randomMatrix(int height, int width){
        int[][] random = new int [height][width]; //declare the matrix
        for (int i=0; i<height; i++){
            random [i] = new int [width]; //declare the size of member arrays
            for (int j=0; j<width; j++){
                random[i][j] = (int)(Math.random()*20) -10; //have the value be between -10 and 10
            }
        }
        return random;
    }//end of randomMatrix
//creat printMatrix method
    public static void printMatrix(int[][] random){
        /*for( int i = 0; i < random.length; i++ ) { 
            for(int j=0; j<((random.length)-1);j++){
                if( random[i].length != random[i+j].length ) { //check that it's rectangular
                System.out.println("Sorry, your matrix input is not rectangular."); //tell user input is not rectangular.
                return;
                }
            }   
        }*/
        for (int i=0; i<random.length; i++){
            for (int j=0; j < random[i].length; j++){
                System.out.print(random[i][j]+" ");
            }
            System.out.println("");
         }
    return; //and return back to the main program
}//end of printArray method

//transpose the matrix
    public static int[][] transposeMatrix(int[][] random, int height, int width){
       int[][]transpose = new int [width][height];
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                int temp = random[i][j];
                random[i][j] = transpose[j][i];
                transpose[j][i] = temp;
            }
        }
        return transpose;
            
    }//end of transposeMatrix method
}    