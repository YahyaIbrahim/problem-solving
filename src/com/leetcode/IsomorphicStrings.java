package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i), charT = t.charAt(i);
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT)
                    return false;
            } else {
                if (map.containsValue(charT))
                    return false;
                map.put(charS, charT);
            }
        }
        return true;
    }
}
