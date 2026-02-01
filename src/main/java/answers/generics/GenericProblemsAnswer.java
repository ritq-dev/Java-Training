package answers.generics;

import java.util.*;

public class GenericProblemsAnswer {

    public static <T> List<T> createList(T... items) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, items);
        return list;
    }

    public static int countOccurrences(List<?> list, Object value) {
        int cnt = 0;
        for (Object o : list) {
            if (o == null ? value == null : o.equals(value)) cnt++;
        }
        return cnt;
    }

    public static Comparable findMax(List<? extends Comparable> list) {
        if (list == null || list.isEmpty()) throw new IllegalArgumentException("list empty");
        Comparable max = list.get(0);
        for (Comparable c : list) {
            if (c.compareTo(max) > 0) max = c;
        }
        return max;
    }
}
