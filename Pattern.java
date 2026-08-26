package ForLoop;

public class Pattern {
    public static void main(String[] args) {

        int n = 6;
        int i, j;

        for (i = 1; i <= n - 1; i++) {

            for (j = 1; j <= n - 1; j++) {
                System.out.print("  ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(" *  ");
            }

            System.out.println();
        }

        for (i = n; i >= 1; i--) {

            for (j = 1; j <= n - 1; j++) {
                System.out.print("  ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(" *  ");
            }

            System.out.println();
        }
    }
}