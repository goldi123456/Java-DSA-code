import java.util.Scanner;

public class primeinrange {
    public static boolean Isprime(int n) {

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;

            }

        }
        return true;

    }

    public static void Primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (Isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Primeinrange(n));

    }

}
