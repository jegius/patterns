package java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Persone> persones = Arrays.asList(
                new Persone("Ivan", 22),
                new Persone("Roman", 24),
                new Persone("Dmitry", 19),
                new Persone("Sergey", 24),
                new Persone("Ira", 20));

        getSeparator();
        System.out.println("FILTERING");
        getSeparator();

        List<Persone> filtered = persones.stream()
                .filter(persone -> persone.getName().startsWith("I"))
                .collect(Collectors.toList());

        for (Persone p : filtered) {
            System.out.println("name: " + p.getName() + " age: " + p.getAge());
        }

        getSeparator();
        System.out.println("GROUPING");
        getSeparator();

        Map<Integer, List<Persone>> personeByAge = persones
                .stream()
                .collect(Collectors.groupingBy(Persone::getAge));
        personeByAge.forEach((age, p) -> System.out.printf("age %s: %s\n", age, p));

        getSeparator();
        System.out.println("AVERAGE");
        getSeparator();

        Double averageAge = persones
                .stream()
                .collect(Collectors.averagingInt(Persone::getAge));

        System.out.println(averageAge);

        getSeparator();
        System.out.println("SUM");
        getSeparator();

        IntSummaryStatistics ageSummary = persones
                .stream()
                .collect(Collectors.summarizingInt(Persone::getAge));

        System.out.println(ageSummary);

        getSeparator();
        System.out.println("JOINING");
        getSeparator();

        String phrase = persones
                .stream()
                .filter(p -> p.getAge() >= 20)
                .map(Persone::getName)
                .collect(Collectors.joining(" и ", " в Германии ", " совершенолетние"));

        System.out.println(phrase);

        getSeparator();
        System.out.println("TO MAP");
        getSeparator();

        Map<Integer, String> personeMap = persones
                .stream()
                .collect(Collectors.toMap(
                        Persone::getAge,
                        Persone::getName,
                        (name1, name2) -> name1 + "; " + name2));

        System.out.println(personeMap);
    }

    private static void getSeparator() {
        System.out.println("==================================================");
    }

}
