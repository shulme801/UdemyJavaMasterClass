public class Main {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber){
            number++;
            if (! isEvenNumber(number)) {
                continue;
            }
            System.out.println(number + " is even!");
        }


    }

    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0);
    }


}
