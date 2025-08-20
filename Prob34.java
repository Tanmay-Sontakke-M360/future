public class Prob34 {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(j == count-1){
                    System.out.print(19 + " ");
                    continue;
                }
                System.out.print(0 + " ");
            }
            count++;
            System.out.println();
        }
    }
}

