public class Main {
    public static void main(String[] args) {

        int primeCount = 0;

        for (int i = 10; i <= 50; i++){
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeCount++;
            }
            if (primeCount == 15) {
                break;
            }
        }

    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber/2; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
