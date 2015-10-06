import java.util.Scanner;
public class Symmetrit {
    public static void main(String args[]){
        Scanner Scan = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int Num=Scan.nextInt();
        if ( Num >= 100000 || Num <= 9999) {
            System.out.println("Not a valid input.");
            
        }
        else {
            int TenThousand = (Num/10000);
            System.out.println(TenThousand);
            int Thousand = (Num - (TenThousand*10000)) /1000;
            System.out.println(Thousand);
            int Hundred = (Num - ((TenThousand*10000) + (Thousand*1000)))/100;
            System.out.println(Hundred);
            int Ten = (Num - ((TenThousand*10000) + (Thousand*1000) + (Hundred*100)))/10;
            System.out.println(Ten);
            int One = (Num - ((TenThousand*10000) + (Thousand*1000) + (Hundred*100) + (Ten*10)));
            System.out.println(One);
            if (TenThousand==One && Thousand==Ten){
                System.out.println("Your number is symmetric!");
            }
            else {
                System.out.println("Your number is not symmetric.");
            }
        }
    }
}