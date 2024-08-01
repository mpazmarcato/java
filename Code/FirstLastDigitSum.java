package Code;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));  // Expected output: 4
        System.out.println(sumFirstAndLastDigit(257));  // Expected output: 9
        System.out.println(sumFirstAndLastDigit(0));    // Expected output: 0
        System.out.println(sumFirstAndLastDigit(5));    // Expected output: 10
        System.out.println(sumFirstAndLastDigit(-10));  // Expected output: -1
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int sum = firstDigit + lastDigit;
        return sum;
    }
}
