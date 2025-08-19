import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping, the first integer is: " + n1);
        System.out.println("After swapping, the second integer is: " + n2);
        sc.close();
    }
}
