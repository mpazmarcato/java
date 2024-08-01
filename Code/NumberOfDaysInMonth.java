package Code;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));

        System.out.println(getDaysInMonth(2, 2020));

        System.out.println(getDaysInMonth(2, 2018));

        System.out.println(getDaysInMonth(-1, 2020));

        System.out.println(getDaysInMonth(1, -2020));

    }

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

    public static int getDaysInMonth (int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 9: case 11:
                days = 31;
                break;
            case 4: case 6: case 8: case 10: case 12:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = -1;
                break;
        }

        return days;
    }
}
