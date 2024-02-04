package loops;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        lol(n);
    }
    static void lol(int n) {
        int x = 0, y = 1;
        System.out.println( n);
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            int m = x + y;
            x = y;
            y = m;
        }
    }
}
