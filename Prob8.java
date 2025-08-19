import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the moblie number:");
        long mobile = sc.nextLong();
        if(age < 18) {
            System.out.println("Sorry! You need to be at least 18 years old to get membership.");
            return;
        }
        System.out.println("Congratulations"+ name +"for your successful registration.");
        sc.close();
    }
}
