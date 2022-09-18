package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class DigitAdderTest {

    @Test
    @DisplayName("number 123 -> 6")
    void case1() {
        // Given
        DigitAdder digitAdder = new DigitAdderImpl();

        // When
        int number = 123;

        // Then
        assertEquals(6, digitAdder.solution(number));
    }

    @Test
    @DisplayName("number 987 -> 24")
    void case2() {
        // Given
        DigitAdder digitAdder = new DigitAdderImpl();

        // When
        int number = 987;

        // Then
        assertEquals(24, digitAdder.solution(number));
    }

    @Test
    @DisplayName("[another] number 987 -> 24")
    void case3() {
        // Given
        DigitAdder digitAdder = new DigitAdderImplAnother();

        // When
        int number = 987;

        // Then
        assertEquals(24, digitAdder.solution(number));
    }

    @Test
    @DisplayName("number 11111111 -> 8")
    void case4() {
        // Given
        DigitAdder digitAdder = new DigitAdderImpl();

        // When
        int number = 11111111;

        // Then
        assertEquals(8, digitAdder.solution(number));
    }

    @Test
    @DisplayName("[another] number 11111111 -> 8")
    void case5() {
        // Given
        DigitAdder digitAdder = new DigitAdderImplAnother();

        // When
        int number = 11111111;

        // Then
        assertEquals(8, digitAdder.solution(number));
    }
}
