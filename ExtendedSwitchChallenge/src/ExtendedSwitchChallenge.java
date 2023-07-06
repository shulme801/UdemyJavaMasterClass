public class ExtendedSwitchChallenge {
    public static void main(String[] args) {
        for (int i = 0; i<7; i++) {
            System.out.println("Day of week number "
                                + i
                                + " is called "
                                +  findDayOfWeek(i));
        }
        System.out.println("That's all, folks\n");
    }

    public static String findDayOfWeek(int day){

        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                yield "Day " + day + " is not a valid day of the week";
            }
        };

    }
}
