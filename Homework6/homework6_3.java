import java.util.Scanner;

public class homework6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int qiw = 1;
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                qiw ++;
                if (qiw > max) max = qiw;
            } else {
                qiw = 1;
            }
        }
        System.out.println(max);
    }
}