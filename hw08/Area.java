/*  Megan Olivola
hw08 - Area
This program will find the area of a triangle, circle, or rectangle.
October 20, 2015 */

import java.util.Scanner; //import scanner

//define class
public class Area{
    //create main method
    public static void main(String[] args){
    Scanner MyScanner = new Scanner (System.in);
    String Shape = "";
    System.out.print("Enter the shape of which you want to find the area: ");
    Shape = verifyshape(MyScanner); //call method called input
    if ((Shape).equals("rectangle")) {
        Rectangle(); //call method rectangle
    }
    else if((Shape).equals("circle")) {
        Circle(); //call method circle
    }
    else if((Shape).equals("triangle")){
        Triangle(); //call program triangle
    }
    
    }//end of main method
    //create other methods
//method for correct shape input
public static String verifyshape(Scanner in){
      String i = "";
      String rectangle = "rectangle";
      String circle = "circle";
      String triangle = "triangle";
      boolean flag = true;
      while(flag) { //will run through at least once{
        if(in.hasNext("triangle")){
            //check if it's triangle
            i=in.next(); //i gets the string
            flag=false; //since we now have a valid input, we can exit the loop 
            }
        else if(in.hasNext("circle")){
            //check if it's circle
            i=in.next(); //i gets the string
            flag=false; //since we now have a valid input, we can exit the loop 
            }
        else if(in.hasNext("rectangle")){
            //check if it's rectangle
            i=in.next(); //i gets the string
            flag=false; //since we now have a valid input, we can exit the loop 
            }
        else{ //otherwise
                System.out.print("ERROR:  please enter triangle, rectangle, or circle: "); //tell user they have wrong input
                in.next(); //and try again.
            }
        }
       return i; //return to the program with the correct input
    } //end of method verifyshape
    
//method rectangle
public static void Rectangle(){
    Scanner MyScanner = new Scanner (System.in); //input scanner
    System.out.print("Please enter the height: "); //prompt for height
    double height = verify(MyScanner); //store height with verified input
    System.out.print("Please enter the width: ");
    double width = verify(MyScanner); //store width with verified input
    double Area = width*height; //calculate area
    System.out.println("The area is " +  Area); //print out the area
    return; //return back to program
} //end of rectangle method


//circle method
public static void Circle(){
    Scanner MyScanner = new Scanner (System.in); //input scanner
    System.out.print("Please enter the radius: "); //prompt for radius
    double radius = verify(MyScanner); //store radius with verified input
    double Area = (radius*radius)*Math.PI; //calculate area
    System.out.println("The area is " +  Area); //print out the area
    return; //return back to program
    
} //end of circle method


//triangle method
public static void Triangle(){
    Scanner MyScanner = new Scanner (System.in); //input scanner
    System.out.print("Please enter the height: "); //prompt for height
    double height = verify(MyScanner); //store height as verified input
    System.out.print("Please enter the length of the base: "); //prompt for length
    double length = verify(MyScanner); //store with verified input
    double Area = (length/2)*height; //calculate area
    System.out.println("The area is " +  Area); //print out the area
    return; //return back to program
}//end of triangle method

//verifying input (doubles) method
public static double verify(Scanner in){
      double i=0.0; //i is a double
      boolean flag= true;
      while(flag) { //runs through once
        if(in.hasNextDouble()){ //if input is a double
          i=in.nextDouble(); //store i as that double
            flag=false; //and exit loop
        }
        else{ //if input is not a double
          System.out.print("ERROR: please enter a double: "); //print error message
          in.next(); //and take the next input
         }
       }
       return i; //return with valid input
}//end of verify method

    
}//end of class