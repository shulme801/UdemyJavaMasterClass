public class NumberOfDaysInMonth {
    public static void main(String[] args) {
       // Test data from instructor + some of my own
        int[] isLeapArray = new int[] {-1600, 1600, 2017, 1900, 2000, 2020, 2024, 400, 2100};
        for (int leapYr : isLeapArray) {
            System.out.println("Is " + leapYr + " a leap year? " + isLeapYear(leapYr));
        }

        System.out.println("\n");

       int[] yearArray = new int[] {1900, 1901, 1902, 1903, 1904, 1905, -1906, 2018, -2020, 2020 };

       for (int yr : yearArray) {
           for (int i = 0; i <= 13; i++) {
               System.out.println("Number of days in " + getMonthName(i) + " " + yr + " is " + getDaysInMonth(i, yr));
           }
           System.out.println("\n");
       }
    }

    public static boolean isLeapYear(int year ) {

        if (( year < 1 ) || ( year > 9999)) {
            return false;
        }

        if ((year % 4 == 0) && (year % 100 != 0)) {
            // if year is evenly divisible by 4 and not by 100, it's a leap year
            return true;
        } else {
            // if year is evenly divisible by 400, it's a leap year, otherwise it is not a leap year
            return year % 400 == 0;
        }
    }

    public static String getMonthName(int monthNum) {

        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Bad Month";
        };
    }
    public static int getDaysInMonth( int monthNum, int year ){
        // Revised instructor's solution to use extended switch statement

        if (( year < 1 ) || ( year > 9999)) {
            return -1;
        }

        return switch (monthNum) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31; // January, March, May, July, August, October, December
            case 2 -> // February's days depend on whether it's a leap year
            {
                if (isLeapYear(year)) {
                   yield 29;
                } else {
                    yield 28;
                }
            }
            case 4, 6, 9, 11 -> 30;  // April, June, September, November
            default -> -1; // monthNum was less than 1 or greater than 12

        };

    }
}


