package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class IntegerDescendingOrederTest {

    @Test
    @DisplayName("n이 118372면 873211")
    void case1() {
        // Given
        IntegerDescendingOrder integerDescendingOrder = new IntegerDescendingOrderImpl();

        // When
        long expect = 873211L;
        long n = 118372L;

        // Then
        assertEquals(expect, integerDescendingOrder.solution(n));
    }
}
