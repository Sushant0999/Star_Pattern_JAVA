public class Vertical_Bridge {
    public static void main(String[] args) {
        int n = 5;
        ver_bri(5);
    }

    private static void ver_bri(int n) {
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        n = n - 1;
        for (int row = 1; row <= n - 1; row++){
            for (int col = n; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
