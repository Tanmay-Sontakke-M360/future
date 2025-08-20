import java.util.Scanner;

public class Prob50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int n = sc.nextInt();
        System.out.print("Enter second Number: ");
        int m = sc.nextInt();
        int prod = 1;
        if(n == 0){
            System.out.println(1);
        }
        while(n > 1){
            prod *= m * m;
            n--;
        }
        System.out.println("Result: " + prod);
        sc.close();
    }
}
