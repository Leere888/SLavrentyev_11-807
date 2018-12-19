import java.util.Scanner;

 public class Homework8_3 {
     public static void main(String[] args) {
         Scanner kuku = new Scanner(System.in);
         System.out.println("Enter number of Strok");
         int q = kuku.nextInt();
         System.out.println("Enter number of Stolbzov");
         int w = kuku.nextInt();
         System.out.println("Enter Matrix");
         int[][] matrisa = new int[q][w];

         for(int i = 0; i < w; i++ ) {
             matrisa[0][i] = kuku.nextInt();
         }
        for(int i = 1; i < w - 1; i++) {
            matrisa[i][w -1] = kuku.nextInt();
        }

        for (int i = w - 2; i >= 0; i--) {
         matrisa[q - 1][i] = kuku.nextInt();
     }
        for (int i = q - 2; i > 0; i--) {
         matrisa[i][0] = kuku.nextInt();
     }
     }
 }