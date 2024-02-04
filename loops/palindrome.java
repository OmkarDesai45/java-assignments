package loops;
import java.util.Scanner;
public class palindrome {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String n = sc.nextLine();

        int x= 1;
        for (int i = 0, j = n.length() - 1; i < j; i++, j--) {
            if (n.charAt(i) != n.charAt(j)) {
                x = 0;
                break;
            }
        }
        if (x==1) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}