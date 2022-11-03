public class Number_Diamond {
    public static void main(String[] args) {
        int n = 5;
        number_diamond(n);
    }

    private static void number_diamond(int n) {
        for(int row = 1; row <= n; row++){
            for(int space = 0; space <= n - row; space++){
                System.out.print("  ");
            }
            for (int i = row; i >= 1; i--){
                System.out.print(i+" ");
            }
            for (int j = 2; j <= row; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int row = n - 1; row >= 1; row--){
            for(int space = 0; space >= row - n; space--){
                System.out.print("  ");
            }
            for (int i = row; i >= 1; i--){
                System.out.print(i+" ");
            }
            for (int j = 2; j <= row; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
