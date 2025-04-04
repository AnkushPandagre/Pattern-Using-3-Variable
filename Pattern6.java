package method_1;

public class Pattern6 {

    public static void main(String[] args) {
       int rows = 5;
       int k = 0;
       for(int i = 1; i<=rows; i++){
        for(int j= 1; j<=i; j++){
            // if(k%2==0){
            //     System.out.print(0 + " ");

            // }else{
            //     System.out.print(1 + " ");
            // }
            System.out.print(k%2 + " ");
            k++;
        }
        System.out.println();
       } 
    }
}