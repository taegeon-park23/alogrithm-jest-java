package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class ColatzGuessTest {

    @Test
    @DisplayName("n=6, return 8")
    void case1() {
        // Given
        ColatzGuess colatzGuess = extracted();

        // When
        int n = 6;
        int expected = 8;

        // Then
        assertEquals(expected, colatzGuess.solution(n));
    }

    @Test
    @DisplayName("n=16, return 4")
    void case2() {
        // Given
        ColatzGuess colatzGuess = extracted();

        // When
        int n = 16;
        int expected = 4;

        // Then
        assertEquals(expected, colatzGuess.solution(n));
    }

    @Test
    @DisplayName("n=626331, return -1")
    void case3() {
        // Given
        ColatzGuess colatzGuess = extracted();

        // When
        int n = 626331;
        int expected = -1;

        // Then
        assertEquals(expected, colatzGuess.solution(n));
    }

    private ColatzGuess extracted() {
        return (n) -> {
            int count = 0;
            for (;;) {
                if (n == 1)
                    return count;
                else if (count == 500)
                    return -1;

                if (n % 2 == 0)
                    n /= 2;
                else if (n % 2 == 1)
                    n = (n * 3) + 1;

                count += 1;
            }
        };
    }
}