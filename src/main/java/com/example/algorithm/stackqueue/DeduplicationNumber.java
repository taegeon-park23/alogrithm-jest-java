package com.example.algorithm.stackqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* DeduplicationNumber : 숫자 중복 제거(같은 숫자는 싫어)
* 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거.
* 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지
*
* @see https://schhol.programmers.co.kr/learn/courses/30/lessons/12906?language=java
*/
public class DeduplicationNumber {
    
    /**
    * @param numbers 중복제거 되지 않은 int 배열
    * @return 중복제거된 int 배열
    */
	public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        for(int number : numbers) {
            if(stack.isEmpty()) 
                stack.push(number);
            else if(stack.peek() != number) {
                list.add(stack.pop());
                stack.push(number);
            }
        }
        
        if(stack.isEmpty())
            list.add(stack.pop());
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
