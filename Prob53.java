public class Prob53 {
    int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int count = 1;
        double res = 0;
        Prob53 prob = new Prob53();
        for(int i = 0; i < 7; i++) {
            res += (double) count / prob.factorial(count);
            count++;
        }
        System.out.println("Sum of series: " + res);
    }
}
