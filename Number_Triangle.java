public class Number_Triangle {
    public static void main(String[] args) {
        int n = 5;
        number_tri(5);
    }

    private static void number_tri(int n) {
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
