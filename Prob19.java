
import java.util.Scanner;

public class Prob19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + ":");
        int n1 = 0, n2 = 1, sum = 0;
        while(sum <= n){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            if (n1 <= n) {
                System.out.print(n1 + " ");
            }

        }
        
        System.out.println();
        sc.close();
    }
}
