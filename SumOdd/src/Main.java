public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of odd integers between 1 and 100 is " + sumOdd(1,100));
        System.out.println("Sum of odd integers between -1 and 100 is " + sumOdd(-1,100));
        System.out.println("Sum of odd integers between 100 and 100 is " + sumOdd(100,100));
        System.out.println("Sum of odd integers between 13 and 13 is " + sumOdd(13,13));
        System.out.println("Sum of odd integers between 100 and -100 is " + sumOdd(100,-100));
        System.out.println("Sum of odd integers between 100 and 1000 is " + sumOdd(100,1000));
    }

    public static boolean isOdd(int number){
        if (number < 0) {
            return false;
        }

        return (number % 2 != 0);

    }

    public static int sumOdd(int start, int end) {
        if ((start <= 0 ) || (end <= 0)) {
            return -1;
        }

        if (end < start) {
            return -1;
        }

        int sumTotal = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumTotal += i;
            }
        }

        return sumTotal;
    }
}
