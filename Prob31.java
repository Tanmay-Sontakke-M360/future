public class Prob31 {
    public static void main(String[] args) {
        int sum = 19;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(sum + " ");
                sum += 19;
            }
            System.out.println();
        }
    }
}

