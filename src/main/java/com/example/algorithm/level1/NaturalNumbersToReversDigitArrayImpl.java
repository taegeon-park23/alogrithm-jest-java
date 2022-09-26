package com.example.algorithm.level1;

public class NaturalNumbersToReversDigitArrayImpl implements NaturalNumbersToReversDigitArray {

    @Override
    public int[] solution(long n) {
        int[] array = Long.toString(n).chars().map(number -> number - 48).toArray();
        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i -= 1)
            reverseArray[array.length - 1 - i] = array[i];
        return reverseArray;
    }
}
