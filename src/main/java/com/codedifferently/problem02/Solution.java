package com.codedifferently.problem02;

import java.util.*;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        TreeMap<String, Integer> letters = new TreeMap<String,Integer>();
        String[] individual = input.split("");
        StringBuilder solution = new StringBuilder();

        for(int i=0; i < individual.length; i++){
            if(letters.get(individual[i])!= null){
                letters.put(individual[i],letters.get(individual[i])+ 1);
            }
            else{
                letters.put(individual[i],1);
            }
        }

        for (String entry : letters.keySet()){
            solution.append(entry);
            solution.append(":");
            solution.append(letters.get(entry) + " ");
        }
        solution.delete(solution.length()-1,solution.length());



        return solution.toString();
    }
}
