package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class NaturalNumbersToReversDigitArrayTest {
    
    @Test
    @DisplayName("n = 12345, return [5, 4, 3, 2, 1]")
    void case1() {
        // Given
        NaturalNumbersToReversDigitArray naturalNumbersToReversDigitArray = new NaturalNumbersToReversDigitArrayImpl();

        // When
        long number = 12345L;
        int[] expect = { 5, 4, 3, 2, 1 };
        
        // Then
        assertArrayEquals(expect, naturalNumbersToReversDigitArray.solution(number));
    }
}
