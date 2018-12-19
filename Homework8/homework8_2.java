import java.util.Scanner;

public class homework8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strok");
        int m = sc.nextInt();
        System.out.println("Enter number of stolbzov");
        int n = sc.nextInt();
        System.out.println("Enter numbers");
        int[][] matrisa = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrisa[i][j] = sc.nextInt();
            }
        }
        int maxSum = 0;
        int ndx = 0;
        for (int i = 0; i < m; i++) {
            int sum1 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += matrisa[i][j];
            }
            if (sum1 > maxSum) {
                maxSum = sum1;
                ndx = i;
            }
        }
        System.out.println("Stroka");
        for(int i = 0;i < n;i++){
            System.out.print(" " + matrisa[ndx][i]);
        }
        maxSum = 0;
        ndx = 0;
        for(int i = 0;i<n;i++){
            int sum1 = 0;
            for (int j = 0; j<m;j++){
                sum1 += matrisa[j][i];
            }
            if (sum1 > maxSum){
                maxSum = sum1;
                ndx = i;
            }
        }
        System.out.println("\nStolbez");
        for(int i = 0;i < m;i++) {
            System.out.print(" "+ matrisa[i][ndx]);
        }
    }
}