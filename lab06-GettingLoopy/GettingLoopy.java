/*
Megan Olivola
lab 06 - GettingLoopy
10/2/15 */

public class GettingLoopy  {
    //define a main method - necessary for all Java programs
    public static void main(String[] args){
    
    System.out.println("Step 1:");
        int counter = 1;
        while (counter <= 6){
            System.out.print(counter);
            counter++;
        }
        while (counter <=14){
            System.out.print("7");
            counter++;
        }
    System.out.println(""); //space
    System.out.println("Step 2: ");
    int Factor = 10;
    int Value = 100;
    System.out.print("WHILE LOOP: ");
    while (Factor<=Value){
        if ( (Factor % 2 == 0) || (Factor % 3 == 0) || (Factor % 4 == 0) ||
        (Factor % 5 == 0) || (Factor % 6 == 0) || (Factor % 7 == 0) ||
        (Factor % 8 == 0) || (Factor % 9 ==0 ) ) {
            //this is not a prime number
        }
        else {
            System.out.print(" " + Factor + " ");
        }
        Factor++;
    }
    System.out.println("");//space
    
    System.out.print("FOR LOOP:  ");
    
    for (int i=10 ; i<100; i++){
           if ( (i % 2 == 0) || (i % 3 == 0) || (i % 4 == 0) ||
        (i % 5 == 0) || (i % 6 == 0) || (i % 7 == 0) ||
        (i % 8 == 0) || (i % 9 ==0 ) ) {
            //this is not a prime number
        }
        else {
            System.out.print(" " + i + " ");
        }
    }
    
    System.out.println("");//space
    
    System.out.print("DO WHILE LOOP:  ");
    
    int dw = 10; 
     
    do{
        if ( (dw % 2 == 0) || (dw % 3 == 0) || (dw % 4 == 0) ||
        (dw % 5 == 0) || (dw % 6 == 0) || (dw % 7 == 0) ||
        (dw % 8 == 0) || (dw % 9 ==0 ) ) {
            //this is not a prime number
        }
        else {
            System.out.print(" " + dw + " ");
        }
        dw++;
    }
    while (dw<100);
    
    System.out.println(""); //space
    System.out.println("Step 3: ");
    int number=1;
    int smiles =(int)(Math.random()*201) + 5 ;   
    
    while (number <= smiles){
        System.out.print("ツ");
        
        if (number % 20 == 0) {
         System.out.println("");
        }
        number++;
    }
    
    System.out.println("");
        
    }
}