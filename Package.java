import java.util.*;

public class Package{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 15) {
            System.out.println("Accepted");
        } else {
            System.out.println("Not Accepted");
        }

        sc.close();
    }
}