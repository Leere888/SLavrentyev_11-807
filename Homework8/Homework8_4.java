import java.util.Scanner;

public class Homework8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк");
        int n = sc.nextInt();
        System.out.println("Введите число столбцов");
        int m = sc.nextInt();
        int[][] matrisa = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrisa[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrisa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
