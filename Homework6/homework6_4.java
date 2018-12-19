import java.util.Scanner;

public class homework6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr) {
        boolean morgana = false;
        outerLoop: for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {morgana = true; break outerLoop;}
            }
        }
        return morgana;
    }
}