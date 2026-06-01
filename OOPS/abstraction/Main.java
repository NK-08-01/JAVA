import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long mod = 1000000007;

        long d0 = 1; // D(0)
        long d1 = 0; // D(1)
        long dn = 0;

        for (int i = 2; i <= n; i++) {

            dn = ((i - 1) * (d0 + d1)) % mod;

            d0 = d1;
            d1 = dn;
        }

        System.out.println(d1);
    }
}