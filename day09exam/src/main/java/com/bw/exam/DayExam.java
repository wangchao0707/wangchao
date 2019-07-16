package com.bw.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DayExam {
  public static void main(String[] args) throws IOException {
    FileReader fileReader = new FileReader("E:/小实训（一）/file/file.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String line = null;
    HashMap<String, Integer> char_map = new HashMap<>();
    Question1 question1 = new Question1();
    Question2 question2 = new Question2();
    Question3 question3 = new Question3();
    Question4 question4 = new Question4();

    while ((line = bufferedReader.readLine()) != null) {

      question1.realfun1(line, char_map);

    }
    char_map.remove(null);
    System.out.println("key   --->     value");
    /*  for (String key : char_map.keySet()) {
      System.out.println(key + "     --->     " + char_map.get(key));
    }*/
    // question2.realfun1(char_map);
    question2.realfun2(char_map);
    //    question4.realfun1(char_map);
  }

}
