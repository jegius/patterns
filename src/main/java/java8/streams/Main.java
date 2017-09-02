package java8.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        getSeparator();
        System.out.println("CUSTOM COLLECTOR");
        getSeparator();

        Collector<Persone, StringJoiner, String> personeStringJoinerStringCollector =
                Collector.of(
                        () -> new StringJoiner(" | "), //supplier
                        (j, p) -> j.add(p.getName().toUpperCase()), //accumulator
                        StringJoiner::merge,                        //combiner
                        StringJoiner::toString);                    //finisher

        String names = persones
                .stream()
                .collect(personeStringJoinerStringCollector);

        System.out.println(names);

        getSeparator();
        System.out.println("FLAT MAP");
        getSeparator();


        List<Foo> foos = new ArrayList<>();

        IntStream.range(1, 4)
                .forEach(i -> foos.add(new Foo("Foo" + i)));

        foos.forEach(foo -> IntStream
                .range(1, 4)
                .forEach(i -> foo.bars.add(new Bar("Bar" + i + " <- " + foo.getName()))));


        foos.stream()
                .flatMap(foo -> foo.bars.stream())
                .forEach(bar -> System.out.println(bar.getName()));

        getSeparator();
        System.out.println("SHOW THE INTERNAL OBJECT WITH THE HELP OF STREAM API");
        getSeparator();

        Optional.of(new Outer())
                .flatMap(outer -> Optional.ofNullable(outer.nested))
                .flatMap(nested -> Optional.ofNullable(nested.inner))
                .flatMap(inner -> Optional.ofNullable(inner.foor))
                .ifPresent(System.out::println);


        getSeparator();
        System.out.println("REDUCE");
        getSeparator();


        persones.stream()
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .ifPresent(System.out::println);

        getSeparator();
        System.out.println("REDUCE [SECOND]");
        getSeparator();

        Persone result = persones.stream()
                .reduce(new Persone("", 0), (p1, p2) -> {
                    p1.setAge(p1.getAge() + p2.getAge());
                    p1.setName(p1.getName() + p2.getName());
                    return p1;
                });
        System.out.println(result.getName() + " " + result.getAge());

        getSeparator();
        System.out.println("REDUCE [THIRD]");
        getSeparator();

        Integer ageSum = persones.stream()
                .reduce(0, (sum, p) -> sum + p.getAge(), (sum1, sum2) -> sum1 + sum2);

        System.out.println(ageSum);

        getSeparator();
        System.out.println("REDUCE [FOURTH]");
        getSeparator();

        Integer ageSums = persones.stream()
                .parallel()
                .reduce(0, (sum, p) -> {
                            System.out.printf("accumulator: sum=%s; person=%s\n", sum, p.getName());
                            return sum += p.getAge();
                        },
                        (sum1, sum2) -> {
                            System.out.printf("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
                            return sum1 + sum2;
                        });
    }

    private static void getSeparator() {
        System.out.println("==================================================");
    }

}
