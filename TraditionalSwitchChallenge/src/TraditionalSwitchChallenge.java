public class TraditionalSwitchChallenge {
        public static void main(String[] args) {

            char charValue = 'C';
            String outString = getNATO(charValue);
            System.out.println(outString);
        }

        public static String getNATO(char charValue) {

            String outString;

            switch (charValue) {
                case 'A':
                    outString = "NATO value of " + charValue + " is Alpha";
                    break;
                case 'B':
                    outString = "NATO value of " + charValue + " is Bravo";
                    break;
                case 'C':
                    outString = "NATO value of " + charValue + " is Charlie";
                    break;
                default:
                    outString = charValue + " is not recognized";
            }

            return outString;
        }

}
