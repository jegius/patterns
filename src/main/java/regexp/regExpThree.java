package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExpThree {

    //[символ символ] - указываем возможные символы в патерне
    private static final String REGEX = "c[ae]l[ae]nd[ae]r";
    private static final String REGEX_FOR_16 = "[a-fA-F0-9]";
    private static final String REGEX_FOR_NO_16 = "[^a-fA-F0-9]";
    //b - в приделах границ слова
    //B - за пределами слова
    private static final String REGEX_FOR_INER_WORD = "\\bcat\\b";
    private static final String REGEX_FOR_OUTER_WORD = "\\Bcat\\B";
    //(?:)-поиск без учета регистра
    private static final String REGEX_FOR_NO_REGISTR = "\\b(?i)Cat\\b";
    //(\d\d)-1 - поиск совпадения с сохраненной группой
    private static final String REGEX_FOR_SEVED_GROUP_MATCH = "\\b\\d\\d(\\d\\d)-\\1-\\1\\b";
    private static final String REGEX_FOR_MULTI_GROUP = "((?:\\d\\d){1,3})";

    private static final String INPUT = "calendar";
    private static final String INPUT_TWO = "F9";
    private static final String INPUT_THREE = "f9";
    private static final String INPUT_FOUR = "cat catilda catachi";
    private static final String INPUT_FIVE = "cat catilda catachi";
    private static final String INPUT_SIX = "2008-08-08";
    private static final String INPUT_SIX_TWO = "2008-07-03";

    public static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);

        Pattern p1 = Pattern.compile(REGEX_FOR_16);
        Matcher m1 = p1.matcher(INPUT_TWO);

        Pattern p2 = Pattern.compile(REGEX_FOR_NO_16);
        Matcher m2 = p2.matcher(INPUT_THREE);

        System.out.println(m.find());
        System.out.println(m1.find());
        System.out.println(m2.find());
        System.out.println("===============================");

        Pattern p3 = Pattern.compile(REGEX_FOR_INER_WORD);
        Pattern p4 = Pattern.compile(REGEX_FOR_OUTER_WORD);
        Matcher m3 = p3.matcher(INPUT_FOUR);
        Matcher m4 = p4.matcher(INPUT_FOUR);
        System.out.println(m4.find());
        System.out.println(m3.find());
        System.out.println("===============================");
        Pattern p5 = Pattern.compile(REGEX_FOR_NO_REGISTR);
        Matcher m5 = p5.matcher(INPUT_FIVE);
        System.out.println("m5 find?: " + m5.find());
        System.out.println("===============================");
        Pattern p6 = Pattern.compile(REGEX_FOR_SEVED_GROUP_MATCH);
        Matcher m6 = p6.matcher(INPUT_SIX);
        Matcher m7 = p6.matcher(INPUT_SIX_TWO);

        System.out.println(INPUT_SIX + ": " + m6.find());
        System.out.println(INPUT_SIX_TWO + ": " + m7.find());
        System.out.println("===============================");

        String test = "123456";

        test.replaceAll(REGEX_FOR_MULTI_GROUP, "$1 $2");


    }
}
