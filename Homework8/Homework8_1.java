import java.util.Scanner;

public class Homework8_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter numbers");
        int[][] matrisa = new int [n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                matrisa[i][j]=sc.nextInt();
            }
        }
        int diagonalSum = 0;
        for(int i = 0;i < n;i++){
            diagonalSum += matrisa[i][i];
        }
        int collateralDiagonalSum = 0;
        for(int i = 0;i < n;i++) {
            collateralDiagonalSum += matrisa[i][n-i-1];
        }
        int rowSum= 0;
        for(int i = 0;i < n;i++) {
            rowSum=0;
            for(int j = 0;j < n; j++) {
                rowSum += matrisa[i][j];

            }
        }
        if(rowSum !=diagonalSum || diagonalSum !=collateralDiagonalSum){
            System.out.println("Isn't Magic");
        }
        else{
            System.out.println("WOOW, It's Magic");
        }

    }
}