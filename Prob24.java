import java.util.Scanner;

public class Prob24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        double sum = 1;
        for(int i = 2; i <= n; i ++) {
            sum += 1.0/Math.pow(i,3);
        }
        System.out.println("The sum of the series 1 + 1/2^3 + 1/3^3 + ... + 1/" + n + "^3 is: " + sum);
        sc.close();
    }
}
