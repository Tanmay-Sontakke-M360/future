public class Prob40 {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 0; i < 4; i++) {
            for(int j = 4-i; j >= 1; j--) {
                System.err.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
