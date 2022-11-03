public class Star_Diamond {
    public static void main(String[] args) {
        int n = 5;
        star_diamond(5);
    }

    private static void star_diamond(int n) {
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            for (int i = 1; i <= row; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n; row >= 1; row--){
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            for (int i = 1; i <= row; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
