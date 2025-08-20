public class Prob38 {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 0; i < 3; i++) {
            int tmp = count;
            if(i == 1){
                tmp--;
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(tmp + " ");
                tmp++;
            }
            System.out.println();
        }
    }
}
