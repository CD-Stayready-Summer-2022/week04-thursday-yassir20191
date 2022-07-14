package com.codedifferently.problem01;
import java.util.*;
public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     *
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers) {
        Arrays.sort(allNumbers);
        StringBuilder longestString = new StringBuilder();
        int startIndex = 0;
        int endIndex = 0;
        int tempStart = 0;
        int tempEnd = 0;
        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < allNumbers.length - 1; i++) {
            tempStart = i;
            longestString.append(allNumbers[i]);
            while (allNumbers[i + 1] - allNumbers[i] == 1) {
                count++;
                i++;
                longestString.append(allNumbers[i]);
            }
            tempEnd = tempStart + count;
            if (tempEnd - tempStart > maxLength) {
                startIndex = tempStart;
                endIndex = tempEnd;
            }
        }
        return "Longest Set: {" + longestString.substring(tempStart, tempEnd - 1).toString() + "}";


    }
}