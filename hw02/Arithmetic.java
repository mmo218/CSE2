///////////////////
//Megan Olivola
//hw02
//Arithmetic Assignment
//due 9/8/2015

//to print with two decimal places, use printf instead of println and use "%.2f", value, then add a println to add space

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
        
        System.out.println("Item being bought = socks   "); //print out these lines
        System.out.println("Amount = " + nSocks);
        System.out.println("Cost of one unit = $" + sockCost$);
        double totalSocks = (nSocks * sockCost$); //calculate the cost of the socks without tax
        System.out.printf("Cost of socks before tax = $" + "%.2f",totalSocks); //print the value with 2 decimals
        double Socktax = (totalSocks * taxPercent); //calculate the tax
        System.out.println(""); //space
        System.out.printf("Tax of socks = $"+"%.2f",Socktax);  //print tax with 2 decimals
        System.out.println(" "); //adding a line so I have space and it's easier to read the output
        System.out.println(" "); //adding a line so I have space and it's easier to read the output
        
        
        System.out.println("Item being bought = glasses"); //print out these lines
        System.out.println("Amount = " + nGlasses);
        System.out.println("Cost of one unit = $" + glassCost$);
        double totalGlasses = (nGlasses * glassCost$); //calculate the cost of the glasses without tax
        System.out.printf("Cost of glasses before tax = $" + "%.2f",totalGlasses); //print the value with 2 decimals
        double Glassestax = (totalGlasses * taxPercent); //calculate the tax
        System.out.println(" "); //space
        System.out.printf("Tax of Glasses = $"+ "%.2f",Glassestax); //print tax with two decimals
        System.out.println(" "); //space
        System.out.println(" "); //adding a line so I have space and it's easier to read the output
        
        System.out.println("Item being bought = envelopes"); //print these lines
        System.out.println("Amount = " + nEnvelopes); 
        System.out.println("Cost of one unit = $" + envelopeCost$);
        double totalEnvelopes = (nEnvelopes * envelopeCost$); //calculate the cost of the glasses without tax
        System.out.printf("Cost of envelopes before tax = $" + "%.2f",totalEnvelopes); //print the value with 2 decimals
        double Envelopetax = (totalEnvelopes * taxPercent); //calculate the tax
        System.out.println(" "); //space
        System.out.printf("Tax of envelopes = $"+"%.2f", Envelopetax); //print tax with 2 decimals
        System.out.println(" "); //space
        System.out.println(" "); //adding a line so I have space and it's easier to read the output
        
     //total cost of purchase before tax
        double BeforeTaxTotal = (totalSocks + totalEnvelopes + totalGlasses);
        System.out.printf("Total before taxes = $" + "%.2f",BeforeTaxTotal); //print the total before tax with 2 decimals
        System.out.println(" "); //adding a line so I have space and it's easier to read the output
        
    //total paid for transaction
        double AfterTaxTotal = (BeforeTaxTotal + Socktax + Glassestax + Envelopetax); //calculate after tax total
        double TotalTax = (Socktax + Glassestax + Envelopetax); //calculate total tax
        System.out.printf("Total tax = $"+"%.2f",TotalTax); //print total tax with 2 decimals
        System.out.println(" "); //space
        System.out.printf("Total after taxes = $"+"%.2f", AfterTaxTotal); //print after tax total with 2 decimals
        System.out.println(" "); //space
    
         
    
        
    //test/testtest
    }
    
}