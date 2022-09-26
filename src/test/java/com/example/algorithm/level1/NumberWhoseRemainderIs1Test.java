package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class NumberWhoseRemainderIs1Test {

    @Test
    @DisplayName("10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return ")
    void case1() {
        // Given
        NumberWhoseRemainderIs1 numberWhoseRemainderIs1 = extracted();

        // When
        int n = 10;
        int expected = 3;

        // Then
        assertEquals(expected, numberWhoseRemainderIs1.solution(n));

    }

    @Test
    @DisplayName("12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.")
    void case2() {
        // Given
        NumberWhoseRemainderIs1 numberWhoseRemainderIs1 = extracted();

        // When
        int n = 12;
        int expected = 11;

        // Then
        assertEquals(expected, numberWhoseRemainderIs1.solution(n));

    }

    private NumberWhoseRemainderIs1 extracted() {
        return (n) -> {
            for (int i = 1; i < n; i += 1) {
                if (n % i == 1)
                    return i;
            }

            return -1;
        };
    }

}
