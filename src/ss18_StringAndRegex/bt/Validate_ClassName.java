package ss18_StringAndRegex.bt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_ClassName {
    static final String[] classNames={"C0318G","M0318G", "P0323A","C09*0G","A0987M"};
    static class ClassNameExample {
        private static Pattern pattern;
        private Matcher matcher;

        private static final String CLASSNAME_REGEX = "^[ACP]+[0-9]+[0-9]+[0-9]+[0-9]+[GHIKLM]$";

        public ClassNameExample() {
            pattern = Pattern.compile(CLASSNAME_REGEX);
        }

        public boolean validate(String regex) {
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
    public static void main(String args[]) {
        ClassNameExample validClassName= new ClassNameExample();
        for (String x:classNames){
            boolean isvalid = validClassName.validate(x);
            System.out.println("ClassName is " + x + " is valid: " + isvalid);
        }
    }
}
