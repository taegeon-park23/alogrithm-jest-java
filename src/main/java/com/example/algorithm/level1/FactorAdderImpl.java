package com.example.algorithm.level1;

public class FactorAdderImpl implements FactorAdder {

    @Override
    public int solution(int number) {
        int answer = 0;
        for (int i = 1; i <= number; i += 1) {
            if (number % i == 0)
                answer += i;
        }
        return answer;
    }
}
