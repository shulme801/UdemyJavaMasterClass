public class SpeedConverter {
        // write your code here
        public static void main(String[] args) {
            printConversion(1.5);
        }

        public static long toMilesPerHour(double kilometersPerHour){
            if (kilometersPerHour < 0) {
                return(-1);
            }

            return Math.round(kilometersPerHour/1.609);

        }

        public static void printConversion(double kilometersPerHour) {

            if (kilometersPerHour < 0) {
                System.out.println("Invalid Value");
                return;
            }

            System.out.println(
                    kilometersPerHour +
                            " km/h = " +
                            Math.round(toMilesPerHour(kilometersPerHour)) +
                            " mi/h"
            );
        }
    }

