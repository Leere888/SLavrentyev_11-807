import java.util.Scanner;
public class homework6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i > - 1; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}