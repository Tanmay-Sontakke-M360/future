import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num < 0){
            num = -1 * num;
        }
        System.out.println("The absolute value is: " + num);
        sc.close();
    }
}
