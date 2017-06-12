package regexp;

import java.util.regex.*;

public class regexpTest {
// (?i) - убирает чувствительность к регистру
    private static final String REGEX = "\\b(?i)dog\\b";
    private static final String INPUT = "dog Dog dog doggie dogg";

    public static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);


        int count = 0;
        while (m.find()) {
            count++;
            System.out.println("Match number "
                    + count);
            System.out.println("start(): "
                    + m.start());
            System.out.println("end(): "
                    + m.end());
        }
    }

}
