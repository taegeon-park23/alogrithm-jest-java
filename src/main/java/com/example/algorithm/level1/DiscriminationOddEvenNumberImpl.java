package com.example.algorithm.level1;

/**
 * @author taegeon-park23
 */
public class DiscriminationOddEvenNumberImpl implements DiscriminationOddEvenNumber {

    @Override
    public String solution(int num) {
        if (num % 2 == 0 || num == 0)
            return "Even";
        else
            return "Odd";
    }
}
