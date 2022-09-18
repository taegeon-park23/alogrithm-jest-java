package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class SquareRootDiscriminationTest {

    @Test
    @DisplayName("n = 121, return 144")
    void case1() {
        // Given
        SquareRootDiscrimination squareRootDiscrimination = new SquareRootDiscriminationImpl();

        // When
        int n = 121;

        // Then
        assertEquals(144, squareRootDiscrimination.solution(n));
    }

    @Test
    @DisplayName("n = 3, return -1")
    void case2() {
        // Given
        SquareRootDiscrimination squareRootDiscrimination = new SquareRootDiscriminationImpl();

        // When
        int n = 3;

        // Then
        assertEquals(-1, squareRootDiscrimination.solution(n));
    }
}