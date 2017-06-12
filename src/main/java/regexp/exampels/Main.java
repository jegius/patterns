package regexp.exampels;

import regexp.exampels.FindDataExamples.MatcherPatternTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserOne on 04.06.2017.
 */
public class Main {

    public static void main(String[] args) {
    String testData = "Вмест999о дипломатии — санкционная дубина: представитель России при ООН раскритиковал политику США\n" +
            "\n" +
            "Россия ожидает разъяснений в связи с расшир23ением США санкций против КНДР, под которы98е подпали три российские компании и один россиянин. Об 12321этом заявил зампостпреда России при ООН Владимир Сафронков.\n" +
            "\n" +
            "«Хотели бы у4384слышать разъяснения от американской стороны по поводу объявленного 1 июня расширения американских санкций в отношении КНДР, под которые подпали три российские компании и один гражданин нашей страны. Данный шаг вызывает недоумение и глубокое разочарование», — сказал Сафронков.\n" +
            "\n" +
            "Ранее США ввели 23санкции в отношении граждан23 России и КНДР в связи с ядерной пр9889граммой Пхеньяна, а также против трёх российских компаний.";


        List<String> testStrings  = new ArrayList<>();
        MatcherPatternTest test = new MatcherPatternTest();

        testStrings = test.findData(testData);

        for (String testS : testStrings){
            System.out.println(testS);
        }

    }
}
