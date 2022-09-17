package com.example.algorithm.level1;

/**
 * DigitAdder 자릿수 더하기
 * 
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 
 * @see https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public interface DigitAdder {

    /**
     * 자연수 N이 주어지면, N의 각 자릿수의 합을 구한다.
     * 
     * @param number 자연수 N, 100,000,000 이하의 자연수
     * @return N의 각 자릿수의 합
     */
    public int solution(int number);
}