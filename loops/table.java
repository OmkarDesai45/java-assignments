package loops;

import java.util.Scanner;

public class table{  
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the table you want to print :");
        int x = sc.nextInt();
    for(int i=x;i<=x*10;i+=x){
    System.out.println(i);
}
    }
} 
}