package loops;
import java.util.Scanner;
public class GCD {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the 1st number : ");
            int a = sc.nextInt();
            System.out.print("Enter the 2nd number : ");
            int b = sc.nextInt();
            
            int g = 1;
            for(int i=1;i<=a && i<=b;i++){
            if (a%i ==0 && b%i ==0){
                g =i;
            }
        }
        System.out.println("The GCD of both the numbers is :"+g);
    }
    }


