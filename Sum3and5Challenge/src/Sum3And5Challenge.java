public class Sum3And5Challenge {
    public static void main(String[] args) {

        int sum3And5 = 0;
        int sumCount = 0;
        for (int i = 1; i <= 1000; i++) {
            if (( i % 3 == 0) && ( i % 5 == 0)) {
                sum3And5 += i;
                System.out.println(i + " is evenly divisible by both 3 and 5");
                sumCount++;
                if (sumCount == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of the numbers evenly divisible by both 3 and 5 is " + sum3And5);
    }
}
