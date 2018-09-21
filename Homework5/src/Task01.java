import java.util.Scanner;

public class Task01 {
    public static void main (String[] args) {
        boolean ans = true;
        Scanner sc = new Scanner(System.in);
        double r = 0;
        double n1;
        double n2;
        while (true) {
            if (ans) {
                n1 = sc.nextDouble();
            } else {
                n1 = r;
            }
            String op = sc.next();
            n2 = sc.nextDouble();
            if (op.equals("+")) {
                r = n1 + n2;
            }
            if (op.equals("-")) {
                r = n1 - n2;
            }
            if (op.equals("/")) {
                r = n1 / n2;
            }
            if (op.equals("*")) {
                r = n1 * n2;
            }
            System.out.println(r);
            System.out.println("Сбросить результат? y/n");
            String answer = sc.next();
            if (answer.equals("y")) {
                ans = true;
            } else {
                ans = false;
            }
        }
    }
}
