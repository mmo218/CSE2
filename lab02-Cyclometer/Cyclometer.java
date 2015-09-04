////////////////////
//Megan Olivola
//lab 02 - Cyclometer
//September 4, 2015

//define a class
public class Cyclometer {
        // main method required for every Java program
       public static void main(String[] args) {
       
            //define my variables
            int secsTrip1=480;  // an integer variable, seconds of trip 1
            int secsTrip2=3220;  // seconds of trip 2
            int countsTrip1=1561;  // number of rotations of the tire in trip 1
            int countsTrip2=9037; // tire rotations trip 2
            
            double wheelDiameter=27.0; // the diameter of the wheel
            double PI=3.14159;  //define the value of pi
            double feetPerMile=5280; //the number of feet in a mile
            double inchesPerFoot=12; //the number of inches in a foot
            double secondsPerMinute=60; //the number of seconds in a minute
            double distanceTrip1; //create the variable for the distance of trip 1, defined as a double
            double distanceTrip2; //variable for trip 2
            double totalDistance; //variable for total distance
      
            //Start calculating things and printing them out
            System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
            System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts."); 
            
            //calculate some more values using previously defined variables
            //for each count, a rotation of the wheel travels the diameter in inches times PI
            distanceTrip1=countsTrip1*wheelDiameter*PI; //gives the value in inches
            distanceTrip1/=inchesPerFoot*feetPerMile; //the slash tells java to divide distanceTrip1 by the inches/foot/mile conversion
            //now my answer is in miles
            distanceTrip2=countsTrip2*wheelDiameter*PI; //gives the value in inches
            distanceTrip2/=inchesPerFoot*feetPerMile; //the slash tells java to divide distanceTrip1 by the inches/foot/mile conversion
            //now my answer is in miles
            totalDistance=distanceTrip1+distanceTrip2; //calculate my total distance
            
            //print out my distances
            System.out.println("Trip 1 was "+distanceTrip1+" miles");
            System.out.println("Trip 2 was "+distanceTrip2+" miles");
            System.out.println("The total distance was "+totalDistance+" miles");

            
            


    }  //end of main method   
} //end of class
