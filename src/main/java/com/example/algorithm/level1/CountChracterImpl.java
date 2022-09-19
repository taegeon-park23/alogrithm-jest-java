package com.example.algorithm.level1;

public class CountChracterImpl implements CountCharacter {

    @Override
    public boolean solution(String s) {
        int countP = 0;
        int countY = 0;

        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'P')
                countP += 1;
            if (c == 'y' || c == 'Y')
                countY += 1;
        }

        if (countP == countY)
            return true;
        return false;
    }

}
