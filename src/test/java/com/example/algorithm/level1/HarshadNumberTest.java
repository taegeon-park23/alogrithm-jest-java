package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class HarshadNumberTest {

    @Test
    @DisplayName("x가 10이면, true를 리턴.")
    void case1() {
        // Given
        HarshadNumber harshadNumber = new HarshadNumberImpl();

        // When
        int x = 10;

        // Then
        assertEquals(true, harshadNumber.solution(x));
    }

    @Test
    @DisplayName("x가 12이면, true를 리턴.")
    void case2() {
        // Given
        HarshadNumber harshadNumber = new HarshadNumberImpl();

        // When
        int x = 12;

        // Then
        assertEquals(true, harshadNumber.solution(x));
    }

    @Test
    @DisplayName("x가 11이면, false를 리턴.")
    void case3() {
        // Given
        HarshadNumber harshadNumber = new HarshadNumberImpl();

        // When
        int x = 11;

        // Then
        assertEquals(false, harshadNumber.solution(x));
    }

    @Test
    @DisplayName("x가 13이면, false를 리턴.")
    void case4() {
        // Given
        HarshadNumber harshadNumber = new HarshadNumberImpl();

        // When
        int x = 13;

        // Then
        assertEquals(false, harshadNumber.solution(x));
    }
}
