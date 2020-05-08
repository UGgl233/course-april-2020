package com.corejava.collectionTopic;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class CollectionsPlayAround {
    private static List<String> findTrueFriends(List<String> friendList1,
                                                List<String> friendList2) {
        List<String> res = new LinkedList<>();
        Set<String> friendSet1 = friendList1.stream().collect(Collectors.toSet());
        for (String f2 : friendList2) {
            if (friendSet1.contains(f2)) res.add(f2);
        }
        return res;
    }

    private static void outputDupChars() {
        String str = "fghuizyqkzuhigu";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 0);
            map.put(c, map.get(c) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) > 1) System.out.println(c + " -> " + map.get(c));
        }
    }

    // 3
    class SimulatedDB {
        Map<String, String> map;
        public SimulatedDB() {
            this.map = new HashMap<>();
        }

        public boolean create(String key, String value) {
            if (!map.containsKey(key)) {
                map.put(key, value);
                return true;
            } return false;
        }

        public String read(String key) {
            return map.get(key);
        }

        public List<String> read(List<String> lst) {
            List<String> res = new LinkedList<>();
            for (String e : lst) res.add(map.get(e));
            return res;
        }

        public boolean update(String key, String value) {
            if (map.containsKey(key)) {
                map.put(key, value);
                return true;
            } return false;
        }

        public boolean delete(String key) {
            if (map.containsKey(key)) {
                map.remove(key);
                return true;
            } return false;
        }
    }

    public static void main(String[] args) {
        List<String> f1 = Arrays.asList("Jame", "Harry", "Elize", "Hoon", "IU");
        List<String> f2 = Arrays.asList("Nev", "Justin", "Jame", "Ang", "IU", "Lisa");
        // 1
        System.out.println(Arrays.toString(findTrueFriends(f1, f2).toArray()));

        // 2
        outputDupChars();
    }
}
