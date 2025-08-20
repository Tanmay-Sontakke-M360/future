import java.util.Scanner;

public class Prob51 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        for (char ch : word.toCharArray()) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print(ch + " is a vowel ");
                    break;
                default:
                    System.out.print(ch + " is a consonant ");
            }
            System.out.println();
        }
        sc.close();
    }
}
