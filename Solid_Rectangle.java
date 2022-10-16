public class Solid_Rectangle {
    public static void main(String[] args) {
        int n = 5;
        solid_rectangle(5);
    }

    private static void solid_rectangle(int n) {
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

 */