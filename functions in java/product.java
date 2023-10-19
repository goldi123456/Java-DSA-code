import java.util.Scanner;

public class product {
    public static void prod(int a, int b) {
        int product = a * b;
        System.out.println("the product is:" + product);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        prod(a, b);

    }

}
