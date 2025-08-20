public class Prob35 {
    public static void main(String[] args) {
        for(int i = 0; i < 13; i++) {
            if(i == 0 || i == 12) {
                for(int j = 0; j <= 8; j++) {
                    System.out.print("*" + " ");
                }
            }
            else if(i%2 == 0) {
                for(int j = 0; j < 10; j++) {
                    if(j == 4){
                        System.out.print("*" + " ");
                    }
                    else {
                        System.out.print(" " + " ");
                    }
                }
            }
            else{
                System.out.println();
            }
        }
    }
}

