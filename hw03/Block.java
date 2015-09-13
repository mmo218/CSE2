//////////////////////////////////
//Megan Olivola
//hw 03 - Program 2  - Block
// 9/15/2015


//import the scanner
import java.util.Scanner;

//define a class
public class Block{
        // main method required for every Java program
       public static void main(String[] args) {
       
       Scanner myScanner = new Scanner (System.in); //you can prompt a user to enter data
       System.out.print ("Enter the length of the block: "); //prompt user for the length
       double Length = myScanner.nextDouble(); //take the input and convert it to a double
       System.out.print ("Enter the width of the block: "); //prompt user for the width
       double Width = myScanner.nextDouble(); //take the input and convert it to a double
       System.out.print ("Enter the height of the block: "); //prompt user for the height
       double Height = myScanner.nextDouble(); //take the input and convert it to a double
       double Volume = (Length * Width * Height); //calculate the volume
       double LW= 2*(Length*Width); //calculate the surface area of the LengthxWidth sides
       double LH = 2*(Length*Height);//calculate SA of the LengthxHeight sides
       double WH = 2*(Width*Height);//calculate the SA of the WidthxHeight sides
       double SurfaceArea = (LW+LH+WH); //calculate surface area
       System.out.println ("The volume of the block of dimensions "+Length+" x "+Width+" x "+Height+" is "+Volume+"."); //print volume
       System.out.println ("The surface area of the block is "+SurfaceArea+"."); //print the surface area
       
       
       } //end of main method
       
}//end of class
       
       