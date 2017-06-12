package regexp.MatchInMatch;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchInMatch
{

    private static final String TEST_TEXT = "I like <b>bold</b> <i>italic</i> fonts";
    private static final String PATTERN = "<[^<>]*>";

    public void run() {
        showAllStrings(getArrayWithWords(TEST_TEXT));
    }

    private List<String> getArrayWithWords(String string){
        List<String> resultList = new ArrayList<>();

        Pattern regex = Pattern.compile(PATTERN);
        Matcher regexMatcher = regex.matcher(string);

        int lastIndex = 0;

        while (regexMatcher.find()){
            resultList.add(string.substring(lastIndex, regexMatcher.start()));
            resultList.add(regexMatcher.group());
            lastIndex = regexMatcher.end();
        }
        resultList.add(string.substring(lastIndex));


        return resultList;
    }

    private void showAllStrings(List<String> matchedStrings){
        for (String match : matchedStrings){
            System.out.println(match);
        }
    }
}
