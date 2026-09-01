
package ForLoop;

import java.util.Scanner;

public class Butterfly {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row, col, n;

        System.out.print("Enter the input: ");
        n = sc.nextInt();

        // Upper Half
        for (row = n; row >= 1; row--) {

            // Print *
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // Print spaces
            for (col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print("  ");
            }

            // Print *
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for (row = 1; row <= n; row++) {

            // Print *
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            // Print spaces
            for (col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print("  ");
            }

            // Print *
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}

