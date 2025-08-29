package org.example.codewars;

public class FindOdd {
    public static int findIt(int[] a) {
        for(int number : a){
            int count = 0;
            for(int i = 0; i < a.length; i++){
                if(number == a[i]){
                    count++;
                }
            }
            if(count % 2 != 0){
                return number;
            }

        }
        return 0;
    }
}
