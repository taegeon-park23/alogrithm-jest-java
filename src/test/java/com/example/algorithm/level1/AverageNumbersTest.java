package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class AverageNumbersTest {

    @Test
    @DisplayName("arr = [1,2,3,4], return = 2.5")
    void case1() {
        // Given
        AverageNumbers averageNumbers = new AverageNumbersImpl();

        // When
        int[] arr = { 1, 2, 3, 4 };

        // Then
        assertEquals(2.5, averageNumbers.solution(arr));
    }

    @Test
    @DisplayName("arr = [5,5], return = 5")
    void case2() {
        // Given
        AverageNumbers averageNumbers = new AverageNumbersImpl();

        // When
        int[] arr = { 5, 5 };

        // Then
        assertEquals(5, averageNumbers.solution(arr));
    }
}
