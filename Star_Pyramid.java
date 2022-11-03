public class Star_Pyramid {
    public static void main(String[] args) {
        int n = 5;
        star_pyramid(5);
    }

    private static void star_pyramid(int n) {
        for(int row = 1; row <= n; row++){
            for(int col = 0; col <= n - row; col++){
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
