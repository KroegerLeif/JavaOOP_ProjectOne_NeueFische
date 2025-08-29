package org.example.codewars;

public class RowSumOddNumbers {

    public static void main(String[] args) {
        rowSumOddNumbers(5);
    }

    public static void rowSumOddNumbers(int n) {
        int[] pyramid = generateOddNumberArray(n);
        for ( int i :pyramid) {
            System.out.println(i);
        }

    }

    private static int[] generateOddNumberArray(int n){
        int[] array = new int[n];
        int valuesToCheck = array.length  *2;
        int valuesAdded = 0;
        for(int i = 0; i < valuesToCheck; i++){
            if(i % 2 != 0){
                array[valuesAdded] = i;
                valuesAdded++;
            }
        }
        return array;
    }

    private static int calculateRowSum(int[] piramid){
        int rows = 0;
        int maxwidth = 1;
        int position = 0;
        for(int i : piramid){
            if(maxwidth == position){
                rows += i;
                maxwidth++;
                position = 0;
            }
            position++;
        }
        return rows;
    }

    private static int[] calculateRowSum(int n, int[] piramid){
        int[] sumPerRow = new int[n];
        for(int i = 0; i < sumPerRow.length; i++){
            int sum = 0;
            int allreadyAdded = i;
            for(int j = allreadyAdded; j < n; j++){
                sum += piramid[j];
            }
            sumPerRow[i] = sum;
        }
        return sumPerRow;
    }
}
