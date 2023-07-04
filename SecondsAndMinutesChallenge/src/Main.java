public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(-9)); // This is the first test case
    }

    public static String getDurationString(int seconds) {

        if (seconds <=0) {
            return("Error -- seconds parameter was "
                    + seconds
                    + "\n which is less than or equal to zero");
        }

        // Let's figure out how many minutes are contained in the input seconds parameter
        int minutes          = seconds / 60;
        // Now, how many whole hours are in the input seconds parameter?
        int hours            = minutes / 60;
        // Next, we're going to figure out how many minutes are left over after we have divided out
        // the hours, that is, given the input seconds, compute the xx hours and yy minutes that this
        // number of seconds produces..
        int remainingMinutes = minutes % 60;
        // Last, given that the input seconds = xx hours and yy minutes, how many seconds remain?
        int remainingSeconds = seconds % 60;


        System.out.println ("hours are " + hours
                            + " remaining minutes are "
                            + remainingMinutes
                            + " remaining seconds are "
                            + remainingSeconds);
        return(hours + "h "
               + remainingMinutes + "m "
               + remainingSeconds + "s\n");
    }

    public static String getDurationString(int minutes, int seconds) {
        return "";
    }
}
