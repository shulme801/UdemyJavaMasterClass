public class OperatorChallenge {

        public static void main(String[] args) {

            double firstDouble = 20.00d;
            double secondDouble = 80.00d;
            double firstResult = (firstDouble+secondDouble)*100.00d;
            System.out.println("First result is "+ firstResult);
            double remainder = firstResult % 40.10d;
            boolean isNoRemainder = (remainder == 0.00d);
            /* boolean isNoRemainder = (remainder == 0.000d) ? true : false; */
            System.out.println("remainder was " + remainder + " and the isNoRemainder boolean is "+ isNoRemainder);
            if (!isNoRemainder) { //In other words, there was a remainder from the modulus operation
                System.out.println("Got a remainder of "+remainder);
            } else {
                System.out.println("Did not get a remainder");
            }

        }
}
