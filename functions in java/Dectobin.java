public class Dectobin {
    public static void dectobin(int Dec_num) {
        int BinNum = 0;
        int pow = 0;
        while (Dec_num > 0) {
            int rem = Dec_num % 2;
            BinNum = BinNum + (rem * (int) Math.pow(10, pow));
            pow++;
            Dec_num = Dec_num / 2;
        }
        System.out.println("binary value=" + BinNum);
    }

    public static void main(String[] args) {
        dectobin(50);

    }

}
