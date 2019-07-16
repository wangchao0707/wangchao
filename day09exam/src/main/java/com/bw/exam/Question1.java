package com.bw.exam;

import java.util.HashMap;

public class Question1 {
  public void realfun1(String line, HashMap<String, Integer> char_map) {
    char[] charArray = line.toCharArray();
    for (char c : charArray) {
      String string_c = String.valueOf(c);
      if (char_map.containsKey(string_c)) {
        Integer char_count = char_map.get(string_c) + 1;
        char_map.put(string_c, char_count);
      } else {
        char_map.put(string_c, 1);
      }
    }
  }
}
