import java.util.Scanner;

public class JavaBasics {

    public static int printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 3;
    }

    public static int calcsum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static void main(String args[]) {
        printHelloWorld();// function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calcsum(a, b);
        System.out.println("sum is : " + sum);

    }

}
