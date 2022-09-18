package com.example.algorithm.level1;

/**
 * NaturalNumbersToReversDigitArray 자연수 뒤집어 배열로 만들기
 * 
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 
 * @see https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public interface NaturalNumbersToReversDigitArray {

    /**
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태리턴하는 메소드
     * 
     * @param n 10,000,000,000이하인 자연수.
     * @return 각 자릿수를 반대방향으로 정렬한 배열
     */
    public int[] solution(long n);
}
