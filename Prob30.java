public class Prob30 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(j + " ");
            }
            for (int j = count - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            count++;
            System.out.println();
        }
    }
}
