public class bintodec {
    public static void binarytodec(int binNum) {
        int decNum = 0;
        int pow = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal value = " + decNum);

    }

    public static void main(String[] args) {
        binarytodec(101);

    }

}
