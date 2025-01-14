package Code;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 99));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int aLastDigit = a % 10;
        int bLastDigit = b % 10;
        int cLastDigit = c % 10;

        boolean lastDigit = aLastDigit == bLastDigit || aLastDigit == cLastDigit || bLastDigit == cLastDigit;
        return lastDigit;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
}
