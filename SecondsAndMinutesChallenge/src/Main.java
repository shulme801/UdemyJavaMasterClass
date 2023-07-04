public class Main {
    public static void main(String[] args) {
        System.out.println("First test case: " + getDurationString(-3945));
        System.out.println("Second test case: " + getDurationString(65, -45));
        System.out.println("Third test case: " + getDurationString(65,145));
        System.out.println("Third test case: " + getDurationString(-65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(0,17));
        System.out.println(getDurationString(0,0));

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return("Error -- invalid data for seconds("+ seconds +"). seconds must be a positive integer");
        }

        return getDurationString(seconds / 60,seconds % 60); // how many minutes were passed in? how many seconds remain when minutes are taken out?

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Error -- invalid data for minutes("+ minutes +"). minutes must be a positive integer";

        }

        if (seconds < 0) {
            return("Error -- invalid data for seconds("+ seconds +"). seconds must be a positive integer");
        }

        if (seconds > 59) {
            return("Error -- invalid data for seconds("+ seconds +"). seconds must be less than or equal to 59");
        }

        // Now, how many whole hours are in the input minutes parameter?
        int hours            = minutes / 60;
        // Next, we're going to figure out how many minutes are left over after we have divided out
        // the hours, that is, given the input seconds, compute the xx hours and yy minutes that this
        // number of seconds produces..
        int remainingMinutes = minutes % 60;


        return(hours + "h "
                + remainingMinutes + "m "
                + seconds + "s\n");
    }
}
