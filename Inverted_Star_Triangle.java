public class  Inverted_Star_Triangle {
    public static void main(String[] args) {
        int n = 5;
        inv_star(5);
    }

    private static void inv_star(int n) {
        for (int row = 1; row <= n; row++){ //Number of lines to be printed
            for (int col = n; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */