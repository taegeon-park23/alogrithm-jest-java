package com.example.algorithm.level1;

public class DigitAdderImpl implements DigitAdder {

    @Override
    public int solution(int number) {
        return Integer.toString(number).chars().map(num -> num - 48).sum();
    }

}
