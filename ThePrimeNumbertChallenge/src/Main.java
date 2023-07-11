public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <=3; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number");
        }

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");
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
