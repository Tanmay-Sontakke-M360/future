import java.util.Scanner;

public class Prob46 {
    
    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Prob46 prob = new Prob46();
        int prime = 0;
        while(n > 0) {
            if(prob.isPrime(n%10)) {
                prime ++;
            }
            n /= 10;
        }
        System.out.println("Number of prime digits: " + prime);
        sc.close();
    }
}
