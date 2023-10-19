public class fibonacciNum {
    public static int fiboNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fiboNum(n - 1);
        int fibnm2 = fiboNum(n - 2);
        int fibnum = fibnm1 + fibnm2;
        return fibnum;
    }

    public static void main(String[] args) {
        int n = 35;
        System.out.println(fiboNum(n));
    }
}
