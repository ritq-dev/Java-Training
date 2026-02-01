package answers.collections;

import java.util.*;

public class CollectionsProblemsAnswer {

    public static Map<String, Integer> countWords(List<String> list) {
        Map<String,Integer> m = new HashMap<>();
        for (String s : list) m.put(s, m.getOrDefault(s,0)+1);
        return m;
    }

    public static List<String> removeTarget(List<String> list, String target) {
        java.util.Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals(target)) it.remove();
        }
        return list;
    }

    public static Map<String, String> makeSimpleLRU(int cap, List<String> keys) {
        LinkedHashMap<String,String> map = new LinkedHashMap<String,String>(16,0.75f,true) {
            protected boolean removeEldestEntry(Map.Entry<String,String> eldest) {
                return size() > cap;
            }
        };
        for (String k : keys) map.put(k, k + "-v");
        return map;
    }
}
