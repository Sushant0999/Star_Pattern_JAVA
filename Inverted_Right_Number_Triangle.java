public class Inverted_Right_Number_Triangle {
    public static void main(String[] args) {
        int n = 5;
        inverted_right(n);

    }

    private static void inverted_right(int n) {
        for(int rows = 1; rows <= n; rows++){
            for(int i = n; i >= rows; i--){
                System.out.print("  ");
            }
            for(int i = rows; i >= 1; i--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
