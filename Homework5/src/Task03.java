import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String str = n.next();
        char[] arr = str.toCharArray();
        String s ="";

        for (int i = 0; i < arr.length; i++) {
            int k = arr[i]-48;
            s = s+" "+ k;
        }

        System.out.println(s);
    }
}