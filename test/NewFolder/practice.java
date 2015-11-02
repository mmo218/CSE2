public class practice{
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            System.out.println("");
            for (int j=0;j<10;j++){
                if (j<5 && i<5){
                    if(j<=i){
                        System.out.print(i);
                    }
                }
                if (j>5 && i>5){
                    if(j>=i){
                        System.out.print(i);
                    }
                }
            }
                
                
        }
    }
}