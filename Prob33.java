public class Prob33 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(j + " ");
            }
            for (int j = count; j >= 1; j--) {
                System.out.print(j + " ");
            }
            count++;
            System.out.println();
        }
    }
}
