package answers.streamsoptional;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsOptionalProblemsAnswer {

    public static int sumEven(List<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public static String orDefault(java.util.Optional<String> opt, String defaultValue) {
        return opt.orElse(defaultValue);
    }

    public static Map<Integer, List<String>> groupByLength(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length));
    }
}
