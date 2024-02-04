package loops;

import java.util.Scanner;

public class sum{  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the 1st nmber ");
            int x = sc.nextInt();
            int m =0;
            for(int i=0;i<=x;i++)
            m += i;
                System.out.println("The sum of all natural numbers is "+m);
    }

    }
    
