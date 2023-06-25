public class Main {
    public static void main(String[] args) {
        int myInches = 8;
        int myFeet   = 5;
        int totalInches = (myFeet*12)+myInches;

        System.out.println(totalInches +
                " inches is " +
                convertToCentimeters(totalInches) +
                " centimeters");

        System.out.println(myFeet +
                " feet " +
                myInches +
                " inches is " +
                convertToCentimeters(myFeet, myInches) +
                " centimeters");
    }


    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;

        return convertToCentimeters(totalInches);
    }

}
