public class Prob39 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { 
                int value = (i + j) % n + 1;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
