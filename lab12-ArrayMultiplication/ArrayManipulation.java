/* Megan Olivola
lab 12 - Array Multiplication
This lab creates a ragged array and manipulates its data.
November 13, 2015 */

public class ArrayManipulation {
    public static void main(String[] args) {
       int memberArrays = (int)(Math.random()*20) + 1; //the number of member arrays
       int [][] ragged = raggedArray(memberArrays); //declare ragged array with number of member arrays
       printArray(ragged, memberArrays);
       
        
        
        
    }
//method raggedArray creates and returns a ragged array that has 10-20 member arrays of 10-20 with numbers
//-1000 to 1000
public static int[][] raggedArray(int memberArrays){
    int[][] multidimA = new int[memberArrays][]; //declare size
    for (int i = 0; i<memberArrays; i++) {
        int random = (int)(Math.random()*10) + 10;
        multidimA[i] = new int [random];
        for (int j = 0; j<random; j++) {
            multidimA[i][j] = (int)(Math.random()*2000) - 1000;
        }
    }
    return multidimA;
} //end of raggedArray

public static void printArray(int[][] raggedArray, int memberArrays) {
    for (int i=0; i<memberArrays; i++){
       for (int j=0; j < raggedArray[i].length; j++){
           System.out.print(raggedArray[i][j]+" ");
       }
       System.out.println("");
    }
    return; //and return back to the main program
}//end of printArray method

    
}//end of class

    
    
    
    
    