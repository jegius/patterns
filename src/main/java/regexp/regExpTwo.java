package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExpTwo {

    //[символ символ] - указываем возможные символы в патерне
    private static final String REGEX = "c[ae]l[ae]nd[ae]r";
    private static final String INPUT = "calendar";

    public static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);

        System.out.println(m.find());

    }
}
