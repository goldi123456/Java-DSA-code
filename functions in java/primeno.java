import java.util.Scanner;

public class primeno {
    public static boolean Isprime(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Isprime(n));
    }

}
