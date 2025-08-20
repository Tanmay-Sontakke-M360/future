public class Prob37 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                for (int j = 0; j < 12; j++) {
                    if (j <= 6) {
                        System.out.print("*" + " ");
                    }

                }
                System.out.println();
            }
            else if(i > 0 && i%2 == 0){
                for (int j = 0; j < 12; j++) {
                    if(j == 6 || j == 11) {
                        System.out.print("*" + " ");
                    }
                    else{
                        System.out.print(" " + " ");
                    }
                }
            }

        }
    }
}
