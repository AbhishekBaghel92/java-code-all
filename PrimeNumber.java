import java.util.*;

public class PrimeNumber {

    public static int sumprime(int num) {
        int sum = 0;

        for (int i = 2; i <= num; i++) {
            int temp = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = 1;
                    break;
                }
            }

            if (temp == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Sum of prime numbers: " + sumprime(num));
    }
}