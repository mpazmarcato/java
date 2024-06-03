public class PositiveNegativeZero {
    public static void main(String[] args) {

    }
    public static void checkNumber (int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}
