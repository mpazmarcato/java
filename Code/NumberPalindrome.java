package Code;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));    // should return true
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome (int number) {
        int originalNumber = number < 0 ? -number : number;
        int reverse = 0;
        int temp = originalNumber;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        return reverse == originalNumber;
    }
}
