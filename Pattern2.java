package method_1;

public class Pattern2 {
    public static void main(String[] args) {
        int row = 5;
    for(int i= 1; i<=row; i++){
        int k = row;
        for(int j= 1; j<=i; j++){
            System.out.print(k + " ");
            k--;
        }
        System.out.println();
    }
    }
}
