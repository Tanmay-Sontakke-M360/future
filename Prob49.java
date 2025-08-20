import java.util.Scanner;

public class Prob49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int count = 0;
        int incDigSum = 0;
        while (n > 0) {
            int digit = n % 10 + 1;
            incDigSum += Math.pow(10, count) * digit;
            n /= 10;
            count++;
        }
        System.out.println("Incremented Digit Sum: " + incDigSum);
        sc.close();
    }
}
