public class Main {
    public static void main(String[] args) {
        int myInches = 2;
        int myFeet   = 6;

        System.out.println(myInches+
                " inches is " +
                convertToCentimeters(myInches) +
                " centimeters");

        System.out.println(myFeet +
                " feet " +
                myInches +
                " inches is " +
                convertToCentimeters(myFeet, myInches) +
                " centimeters");
    }


    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
       return convertToCentimeters((heightInFeet*12) + heightInInches);
    }

}