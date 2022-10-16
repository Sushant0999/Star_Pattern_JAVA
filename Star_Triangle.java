public class Star_Triangle {
    public static void main(String[] args) {
        int n = 5;
        star(5);
    }

    private static void star(int n) {
        for (int row = 1; row <= n; row++){ //Number of lines to be printed
            for (int col = 1; col <= row; col++){ //Number of stars to be printed in each line
                System.out.print("* ");
            }
            System.out.println();  //New line after every line is completed
        }
    }
}

/*

 *
 * *
 * * *
 * * * *
 * * * * *

 */