package Code;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;


        while (true) {
            String entry = scanner.nextLine();
            try {
                int validNumber = Integer.parseInt(entry);
                count++;
                sum += validNumber;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        long average = Math.round((double) sum / count);

        if (count > 0) {
            System.out.println("SUM = " + sum + " AVG = " + average);
        } else {
            System.out.println("SUM = " + sum + " AVG = " + average);
        }
    }
}
