package method_1;

public class Pattern8 {

    public static void main(String[] args) {
        int rows = 5;
         int k = 0;
         for(int i = 1; i<=rows; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(k%5 + " ");
                k++;
            }
            System.out.println();
         }
    }
}