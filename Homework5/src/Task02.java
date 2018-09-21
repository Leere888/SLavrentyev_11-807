import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Введите строку cодержащую числа:");
    String s = n.next();
    char[] arr = s.toCharArray();
    System.out.println("Хоба!");
    for (int i = 0; i < arr.length; i++) {
        if ((arr[i] >= 48)&&(arr[i] <= 57)) {
            arr[i] = '*';
            System.out.print(arr[i]);
        }
        else {
            System.out.print(arr[i]);
        }
    }
}
}