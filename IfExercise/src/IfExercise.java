public class IfExercise {

    public static void main(String[] args) {

        System.out.println("Hello, Mr. Hulme");

        boolean isAlien = false;
        if (isAlien) {
            System.out.println("It is an alien!!");
            System.out.print("And I am scared of Aliens!!");
        }

        //Next code example follows
        int topScore = 80;
        if (topScore >= 100) {

            System.out.println("You got the high score!!!!!!!");

        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore <100)) {

            System.out.println("topScore is greater than secondTopScore and topScore is less than 100");

        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is not an error!!");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen!!");
        }

        String makeOfCar = "Rolls Royce";
        /*

        boolean isDomestic = (makeOfCar == "Rolls Royce") ? false : true;
        if (isDomestic) {
            System.out.println("Make is domestic");
        } else {
            System.out.println("Make is not domestic");
        }

         */


        boolean isDomestic = (!makeOfCar.equals("Rolls Royce"));
        if (isDomestic) {
            System.out.println("Make is domestic");
        } else {
            System.out.println("Make is not domestic");
        }

    }
}
