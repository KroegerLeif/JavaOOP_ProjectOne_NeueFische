package org.example.codewars;

import java.util.HashMap;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        return containsCharacters(createMapOfValues(str1),str2);
    }

    private static HashMap createMapOfValues(String str){
        HashMap<Character, Integer> uniqueValues = new HashMap<>();
        for(char c : str.toCharArray()){
            if(uniqueValues.containsKey(c)){
                uniqueValues.put(c, uniqueValues.get(c) + 1);
            }else{
                uniqueValues.put(c, 1);
            }
        }
        return uniqueValues;
    }

    private static boolean containsCharacters(HashMap<Character, Integer> str1, String str2){
        for(char c : str2.toCharArray()){
            if(str1.containsKey(c)){
                if(str1.get(c) == 0){
                    return false;
                }else{
                    str1.put(c, str1.get(c) - 1);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}

