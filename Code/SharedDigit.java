package Code;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99) {
            return false;
        }
        if (b < 10 || b > 99) {
            return false;
        }

        int aFirstDigit = a / 10;
        int aSecondDigit = a % 10;

        int bFirstDigit = b / 10;
        int bSecondDigit = b % 10;

        boolean sharedDigit = aFirstDigit == bFirstDigit || aFirstDigit == bSecondDigit || aSecondDigit == bFirstDigit || aSecondDigit == bSecondDigit;
        return sharedDigit;
    }
}
