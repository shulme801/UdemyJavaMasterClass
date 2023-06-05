public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        if (isLeapYear(2000)) {
            System.out.println("2000 is a leap year");
        } else {
            System.out.println("2000 is not a leap year");
        }

        printConversion(151.00);
    }

// These are code samples that I wrote for the first set of coding exercises in the Java MasterClass Course
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return(-1);
        }

        return Math.round(kilometersPerHour/1.609);

    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long mph = toMilesPerHour(kilometersPerHour);
            System.out.println("mph is " + mph);
        }
    }
    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        } else {
            return (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0);
        }
    }
}

