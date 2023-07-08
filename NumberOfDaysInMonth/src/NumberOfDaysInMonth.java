public class NumberOfDaysInMonth {
    public static void main(String[] args) {
       // Test data from instructor + some of my own


       System.out.println("Is -1600 a leap year? " + isLeapYear(-1600));
       System.out.println("Is 1600 a leap year? " + isLeapYear(1600));
       System.out.println("Is 2017 a leap year? " + isLeapYear(2017));
       System.out.println("Was 1900 a leap year? " + isLeapYear(1900));
       System.out.println("Is 2000 a leap year? " + isLeapYear(2000));
       System.out.println("Is 2020 a leap year? " + isLeapYear(2020));
       System.out.println("Is 2024 a leap year? " + isLeapYear(2024));
       System.out.println("Was 400 a leap year? " + isLeapYear(400));
       System.out.println("Will 2100 be a leap year? " + isLeapYear(2100));

       System.out.println("Number of days in January 2020 is " + getDaysInMonth(1, 2020));
       System.out.println("Number of days in February 2020 is " + getDaysInMonth(2, 2020));
       System.out.println("Number of days in February 2018 is " + getDaysInMonth(2, 2018));
       System.out.println("Number of days in -January 2020 is " + getDaysInMonth(-1, 2020));
       System.out.println("Number of days in January -2020 is " + getDaysInMonth(1, -2020));
       System.out.println("Number of days in December 2020 is " + getDaysInMonth(12, 2020));

       int[] yearArray = new int[] {1900, 1901, 1902, 1903, 1904, 1905, -1906};

       for (int yr : yearArray) {
           for (int i = 0; i <= 13; i++) {
               System.out.println("Number of days in " + getMonthName(i) + " " + yr + " is " + getDaysInMonth(i, yr));
           }
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


