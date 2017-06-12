package regexp.exampels.FindDataExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by UserOne on 04.06.2017.
 */
public class MatcherPatternTest {


    public List<String> findData(String testData) {
        List<String> strings = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(testData);

        while (matcher.find()){
            strings.add("Start with :" + matcher.start());
            strings.add(matcher.group());
            strings.add("End with :" + matcher.end());

        }

        return strings;
    }
}
