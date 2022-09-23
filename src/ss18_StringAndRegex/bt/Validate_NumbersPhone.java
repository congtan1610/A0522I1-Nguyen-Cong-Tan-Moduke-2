package ss18_StringAndRegex.bt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_NumbersPhone {
    static final String[] numbersPhones={"(84)-(0978489648)","(a8)-(22222222)", "(84)-(097648)","(84)-(097_489648)","(38)-(0222222222)"};
    static class NumbersPhoneExample {
        private static Pattern pattern;
        private Matcher matcher;

        private static final String NumbersPhone_REGEX = "^[(0-90-9)]+[-]+[(]+[0]+[0-9]{9}+[)]$";

        public NumbersPhoneExample() {
            pattern = Pattern.compile(NumbersPhone_REGEX);
        }

        public boolean validate(String regex) {
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
    public static void main(String args[]) {
        NumbersPhoneExample  validNumbersPhone= new NumbersPhoneExample();
        for (String x:numbersPhones){
            boolean isvalid = validNumbersPhone.validate(x);
            System.out.println("NumbersPhone is " + x + " is valid: " + isvalid);
        }
    }
}
