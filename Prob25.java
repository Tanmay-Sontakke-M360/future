public class Prob25 {
    public static void main(String[] args) {
        int count = 1, i = 1;
        while(count <= 11){
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            i++;
            System.out.println();
        }
    }
}
