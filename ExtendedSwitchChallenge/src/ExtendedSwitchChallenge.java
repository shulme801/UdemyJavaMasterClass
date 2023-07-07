public class ExtendedSwitchChallenge {
    public static void main(String[] args) {
        for (int i = 0; i<8; i++) {
            System.out.println("Day of week number "
                                + i
                                + " is "
                                +  findDayOfWeek(i));
        }

        System.out.println("\n\n");


        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        System.out.println("That's all, folks\n");
    }

    public static String findDayOfWeek(int day){
    // My solution
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> { yield "not a valid day of the week"; }
        };

    }

    public static void printDayOfWeek(int day){
        // This is the instructor's solution

        String dayofWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("Day " + day + " stands for " + dayofWeek);
    }
}
