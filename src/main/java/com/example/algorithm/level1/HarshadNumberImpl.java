package com.example.algorithm.level1;

public class HarshadNumberImpl implements HarshadNumber {

    @Override
    public boolean solution(int x) {
        int sum = Integer.toString(x).chars().map(num -> num - 48).sum(); // ASCII 0 -> 48
        if (x % sum == 0)
            return true;

        return false;
    }

}
