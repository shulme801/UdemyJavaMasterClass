public class Main {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 20){
            if (isEvenNumber(i)) {
                System.out.println(i + " is even!");
            }
            i++;
        }
    }

    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0);
    }


}
