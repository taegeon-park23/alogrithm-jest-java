package com.example.algorithm.level1;

import java.util.Arrays;

public class AverageNumbersImpl implements AverageNumbers {

    @Override
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }

}
