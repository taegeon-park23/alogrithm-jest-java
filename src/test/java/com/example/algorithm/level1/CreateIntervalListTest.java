package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class CreateIntervalListTest {

    @Test
    @DisplayName("x=2, n=5, return [2, 4, 6, 8, 10]")
    void case1() {
        // Given
        CreateIntervalList createIntervalList = (x, n) -> {
            long[] result = new long[n];
            int accumal = 0;

            for (int i = 0; i < n; i += 1) {
                if (x >= 0)
                    accumal += x;
                if (x < 0)
                    accumal -= x;
                result[i] = accumal;
            }

            return result;
        };

        // When
        int x = 2;
        int n = 5;
        long[] expected = { 2, 4, 6, 8, 10 };

        // Then
        assertArrayEquals(expected, createIntervalList.solution(x, n));
    }

}
