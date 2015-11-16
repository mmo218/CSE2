/*  Megan Olivola
lab 11 - Search
This program creates two arrays and then prints out minimums and maximums, then searches for an inputted number.
November 6, 2015 */

import java.util.Scanner; //import scanner

//public class
public class Search {
//main method
public static void main(String[] args){
    Scanner scan = new Scanner(System.in); //import scanner
    //create to int arrays of size 5000
    int[] array1 = new int [5000]; //array1 is of size 5000
    int[] array2 = new int [5000]; //array2 is of size 5000
    //fill array1 with random terms from 0 to 100,000
    for (int i=0; i<5000; i++) { //create a for loop
        array1[i] = (int)(Math.random()*100000);
    }
    //print out min and max of array1
    int max = array1[0]; //define max
    for (int j=0; j<5000; j++) {
        if (max>array1[j] == true ){//compare max with new term 
            max=max; //if it was bigger, max remains the value it was previously
        }
        else {
            max=array1[j]; //otherwise, make it the new value
        }
    }
    System.out.println("The maximum of array1 is: " + max); //print out the maximum
    int min = array1[0]; //define min
     for (int j=0; j<5000; j++) {
        if (min<array1[j] == true ){//compare max with term {
            min=min; //if it was smaller, min remains same value
        }
        else {
            min=array1[j]; //otherwise make this the new value
        }
    }
    System.out.println("The minimum of array1 is: " + min); //print out the minimum
    //fill array2 with increasing random numbers
    //first fill with random numbers
    for (int i=0; i<5000; i++) { 
        array2[i] = (int)(Math.random()*100000);
    }
    //now sort them
     for (int j = 0; j < 5000; j++) {
        for (int k = j + 1; k < 5000; k++) {
            int tmp = 0;
            if (array2[j] > array2[k]) {
                tmp = array2[j];
                array2[j] = array2[k];
                array2[k] = tmp;
            }
        }
    }
    System.out.println("The maximum of array2 is: " + array2[4999]);
    System.out.println("The minimum of array2 is: " + array2[0]);
    System.out.print("Enter an int: "); //prompt user to enter an int
    int look = -1 ;
    do{
    look = scan.nextInt();
    } while (look < 0);
    int first = 0;
    int last = 4999;
    int middle = (first + last)/2;
    
    while( first <= last ){
      if ( array2[middle] < look ){
        first = middle + 1; }   
      else if ( array2[middle] == look ) {
        System.out.println(look + " found at location " + (middle + 1) + ".");
        
        break;
      }
      else {
         last = middle - 1;
      }
        middle = (first + last)/2;
    
    if ( first > last ){
         System.out.println(look + " is not present in the list.\n");
         if (first==5000){
             System.out.println("The number above the key is: none");
         }
         else{
         System.out.println("The number above the key is: " + array2[first]);}
         if (last == -1){
             System.out.println("The number below the key is: none");
         }
         else{
         System.out.println("The number below the key is: "+ array2[last]);}
         
             
         }
    }
    
   // }
}//end of main method
}//end of class