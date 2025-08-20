import java.util.Scanner;

public class Prob18 {
    
    boolean isPrime(int num) {
        if (num <= 1) return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound:");
        int lb = sc.nextInt();
        System.out.println("Enter the upper bound:");
        int ub = sc.nextInt();
        for(int i = lb; i <= ub; i++) {
            Prob18 prob18 = new Prob18();
            if(prob18.isPrime(i)) {
                System.out.println(i + " is a prime number.");
            }
        }
        sc.close();
    }
}
