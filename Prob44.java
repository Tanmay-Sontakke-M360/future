import java.util.Scanner;

public class Prob44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int tmp = n;
        sc.close();
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 3);
            n /= 10;
        }
        if(sum == tmp) {
            System.out.println(tmp + " is an Armstrong number.");
        } else {
            System.out.println(tmp + " is not an Armstrong number.");
        }
    }
}
