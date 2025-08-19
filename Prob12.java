import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the billing amount:");
        int ba = sc.nextInt();
        System.out.println("Do you have a membership card:");
        String membership = sc.next();
        int finalAmount;
        if(membership.equalsIgnoreCase("y")) {
            int discount = 10;
            finalAmount = ba - (ba * discount / 100);
        }else {
            int discount = 3;
            finalAmount = ba - (ba * discount / 100);
        }
        System.out.println("The final amount after discount is: " + finalAmount);
        sc.close();
    }
}
