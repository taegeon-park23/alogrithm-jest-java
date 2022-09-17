package com.example.algorithm.level1;

public class DigitAdderImplAnother implements DigitAdder {

    @Override
    public int solution(int number) {
        int answer = 0;
        for (char ascii : Integer.toString(number).toCharArray()) {
            answer += ascii - 48;
        }
        return answer;
    }

}
