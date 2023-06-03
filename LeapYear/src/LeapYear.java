public class LeapYear {
    public static void main(String[] args) {
        if (isLeapYear(2000)) {
            System.out.println("2000 is a Leap Year");
        } else {
            System.out.println("2000 is not a leap year");
        }
    }

    public static boolean isLeapYear(int year){
        if ((year < 1) || (year > 9999)) {
            return false;
        } else {
            return (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0);
        }
    }
}
