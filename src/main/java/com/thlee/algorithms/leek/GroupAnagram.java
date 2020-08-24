package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String key = String.valueOf(chs);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(key, strList);
            }
        }

        return new ArrayList<>(map.values());
    }
}
