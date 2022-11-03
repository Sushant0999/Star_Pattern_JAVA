public class Number_Pyramid {
    public static void main(String[] args) {
        int n = 5;
        number_pyramid(5);
    }

    private static void number_pyramid(int n) {
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            for (int i = 1; i <= row; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
