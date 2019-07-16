package com.bw.exam;

import java.util.HashMap;
import java.util.Set;

public class Question4 {
  public void realfun1(HashMap<String, Integer> char_map) {
    Set<String> keySet = char_map.keySet();
    for (String key : keySet) {
      if (char_map.get(key) > 3) {
        System.out.println(key + "     --->     " + char_map.get(key));
      }
    }
  }
}
