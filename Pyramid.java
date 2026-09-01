package ForLoop;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, j, n;

        System.out.print("Enter the input: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {

            // spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}