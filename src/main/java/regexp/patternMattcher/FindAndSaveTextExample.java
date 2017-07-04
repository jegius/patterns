package regexp.patternMattcher;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndSaveTextExample {



    public List<String> checkTextOnMatches(String exampleText) {
        List<String> result = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher regexpMatcher = pattern.matcher(exampleText);
        if (regexpMatcher.find()){
            result.add(regexpMatcher.group());
        }

        return result;
    }
}
