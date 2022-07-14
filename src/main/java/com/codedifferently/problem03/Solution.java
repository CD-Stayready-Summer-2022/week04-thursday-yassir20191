package com.codedifferently.problem03;
import java.util.*;
public class Solution {

    public Integer[] stringToNumbers(String[] input) {
        Map<String, Integer> nums = new HashMap<String, Integer>();
        Integer[] translate = new Integer[input.length];
        nums.put("zero", 0);
        nums.put("one", 1);
        nums.put("two", 2);
        nums.put("three", 3);
        nums.put("four", 4);
        nums.put("five", 5);
        nums.put("six", 6);
        nums.put("seven", 7);
        nums.put("eight", 8);
        nums.put("nine", 9);
        nums.put("ten", 10);
        nums.put("eleven", 11);
        nums.put("twelve", 12);
        nums.put("thirteen", 13);
        nums.put("fourteen", 14);
        nums.put("fifteen", 15);
        nums.put("sixteen", 16);
        nums.put("seventeen", 17);
        nums.put("eighteen", 18);
        nums.put("nineteen", 19);
        nums.put("tweenty", 20);

        for (int i = 0; i < input.length; i++) {
            translate[i] = nums.get(input[i]);
        }

        return translate;


    }
}
