public class sumoffirstnnaturalno {
    public static int naturalnum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = naturalnum(n - 1);
        int sn = n + snm1;
        return sn;

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(naturalnum(n));

    }

}
