///////////////////
//Megan Olivola
//hw02
//Arithmetic Assignment
//due 9/8/2015

//define a class
public class Arithmetic{
    
//add main method
    public static void main (String[] args) {
    //define all of my variables
    
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;  
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        ////Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //taxPercent
        double taxPercent=0.06;

    //total cost of each kind of item
        
        System.out.println("Item being bought = socks   ");
        System.out.println("Amount = " + nSocks);
        System.out.println("Cost of one unit = $" + sockCost$);
        double totalSocks = (nSocks * sockCost$);
        System.out.println("Cost of socks before tax = $" + "Value: %.2f",totalSocks);
        double Socktax = (totalSocks * taxPercent);
        System.out.println(" "); //adding a line so I have space and it's easier to read the output
        
        
        System.out.println("Item being bought = glasses");
        System.out.println("Amount = " + nGlasses);
        System.out.println("Cost of one unit = $" + glassCost$);
        double totalGlasses = (nGlasses * glassCost$);
        System.out.println("Cost of glasses before tax = $");
        System.out.printf("Value: %.2f",totalGlasses);
        double Glassestax = (totalGlasses * taxPercent);
        System.out.println(" ");
        
        System.out.println("Item being bought = envelopes");
        System.out.println("Amount = " + nEnvelopes); 
        System.out.println("Cost of one unit = $" + envelopeCost$);
        double totalEnvelopes = (nEnvelopes * envelopeCost$);
        System.out.println("Cost of envelopes before tax = $");
        System.out.printf("Value: %.2f",totalEnvelopes);
        double Envelopetax = (totalEnvelopes * taxPercent);
        System.out.println(" ");
        
     //total cost of purchase before tax
        double BeforeTaxTotal = (totalSocks + totalEnvelopes + totalGlasses);
        System.out.println("Total before taxes = $");
        System.out.printf("Value: %.2f",BeforeTaxTotal);
        
    //total paid for transaction
        double AfterTaxTotal = (BeforeTaxTotal + Socktax + Glassestax + Envelopetax);
        System.out.printf( "Value:  %.2f", AfterTaxTotal); //to print with two decimal places, add "Value:  %.2f", value
        System.out.println(" ");
         
    
        
    //test/testtest
    }
    
}