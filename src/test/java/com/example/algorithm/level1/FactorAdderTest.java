package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class FactorAdderTest {

    @Test
    @DisplayName("12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.")
    void case1() {
        // Given
        FactorAdder factorAdder = new FactorAdderImpl();

        // When
        int number = 12;

        // Then
        assertEquals(28, factorAdder.solution(number));
    }

    @Test
    @DisplayName("5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.")
    void case2() {
        // Given
        FactorAdder factorAdder = new FactorAdderImpl();

        // When
        int number = 5;

        // Then
        assertEquals(6, factorAdder.solution(number));
    }
}
