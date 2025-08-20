import java.util.Scanner;

public class Prob23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum += i + 2;
        }
        System.out.println("The sum of the series 1 + 3 + 5 + ... + " + (2 * n - 1) + " is: " + sum);
        sc.close();
    }
}
