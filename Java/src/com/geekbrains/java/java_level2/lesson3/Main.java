package com.geekbrains.java.java_level2.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"zero", "one", "one", "two", "three", "four", "four", "five", "six", "seven", "seven", "eight", "nine", "ten"};
        String[] uniqWords ={};
        int x = 0;

        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < uniqWords.length; j++){
                if (uniqWords[j].equals(words[i])){
                    x = x + 1;
                }
            }
            if (x > 0) {
                x = 0;
            } else {
                uniqWords[i] = words[i];
                x = 0;
            }
        }

        System.out.println(Arrays.toString(uniqWords));

//        List<String> wordArray = new ArrayList<String>();
//        wordArray = ArrayWords.fillTheArray(wordArray);





//        HashMap<String, Integer> someWods = new HashMap<>();
//        for (int i = 0; i < words.length; i++){
//            String j = new String();
//            someWods.put(j, someWods.getOrDefault(j,0)+1);
//        }
//        System.out.println(someWods);
    }
}
