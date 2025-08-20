import java.util.Scanner;

public class Prob22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1/i;
        }
        System.out.println("The sum of the series 1 + 1/2 + 1/3 + ... + 1/" + n + " is: " + sum);
        sc.close();
    }
}
