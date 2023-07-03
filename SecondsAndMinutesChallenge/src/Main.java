public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945)); // This is the first test case
    }

    public static String getDurationString(int seconds) {

        if (seconds <=0) {
            System.out.println("Error -- seconds parameter was "
                    + seconds
                    + "\n which is less than or equal to zero");
        }

        // Let's figure out how many whole hours are contained in the seconds parameter
        int minutes = seconds / 60;
        int hours   = minutes / 60;
        int remainingMinutes = minutes % 60;
        return ("hours are " + hours
                            + " minutes are "
                            + remainingMinutes);
    }

    public static String getDurationString(int minutes, int seconds) {
        return "";
    }
}
