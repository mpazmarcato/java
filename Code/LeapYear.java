package Code;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; // Divisible by 400
                } else {
                    return false; // Divisible by 100 but not by 400
                }
            } else {
                return true; // Divisible by 4 but not by 100
            }
        } else {
            return false; // Not divisible by 4
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}
