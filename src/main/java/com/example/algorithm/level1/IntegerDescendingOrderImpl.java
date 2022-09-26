package com.example.algorithm.level1;

import java.util.Arrays;

public class IntegerDescendingOrderImpl implements IntegerDescendingOrder {

    @Override
    public long solution(long n) {
        char[] characters = Long.toString(n).toCharArray();
        Arrays.sort(characters);
        char[] reverseCharacters = new char[characters.length];
        for (int i = characters.length - 1; i >= 0; i -= 1)
            reverseCharacters[characters.length - i - 1] = characters[i];

        return Long.valueOf(new String(reverseCharacters)).longValue();
    }

}
