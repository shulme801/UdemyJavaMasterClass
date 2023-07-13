public class Main {
    public static void main(String[] args) {

        int number = 4;
        int startNumber = number + 1;
        int finishNumber = 20;
        int oddCount = 0;
        int evenCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                System.out.println(number + " is odd!");
                oddCount++;
            } else {
                System.out.println(number + " is even!");
                evenCount++;
            }

            if (evenCount == 5) {
                break;
            }
        }
        String range = startNumber + ":" + finishNumber;
        System.out.println(("Count of odd numbers in range " + range + " is " + oddCount));
        System.out.println(("Count of even numbers in range " + range + " is " + evenCount));
    }


    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0);
    }


}
