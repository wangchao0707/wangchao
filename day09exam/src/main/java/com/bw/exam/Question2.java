package com.bw.exam;

import java.util.HashMap;
import java.util.Iterator;

public class Question2 {
  public void realfun1(HashMap<String, Integer> char_map) {
    for (String key : char_map.keySet()) {
      if ((key.compareTo("a") >= 0) && (key.compareTo("z") >= 0)
        || (key.compareTo("A") >= 0) && (key.compareTo("Z") >= 0)) {
        System.out.println(key + "     --->     " + char_map.get(key));
      }
    }
  }

  public void realfun2(HashMap<String, Integer> char_map) {
    Iterator<String> iterator = char_map.keySet().iterator();
    while (iterator.hasNext()) {
      String key = iterator.next();
      if ((key.compareTo("a") >= 0) && (key.compareTo("z") >= 0)
        || (key.compareTo("A") >= 0) && (key.compareTo("Z") >= 0)) {
        System.out.println(key + "     --->     " + char_map.get(key));
      }
    }
  }
}
