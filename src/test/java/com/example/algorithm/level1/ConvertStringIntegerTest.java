package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class ConvertStringIntegerTest {

    private ConvertStringInteger extracted() {
        return (String str) -> {
            switch (str.charAt(0)) {
                case '+':
                    return Integer.parseInt(str.substring(1));
                case '-':
                    return -Integer.parseInt(str.substring(1));
                default:
                    return Integer.parseInt(str);
            }
        };
    }

    @Test
    @DisplayName("str이 \"1234\"이면 1234 반환.")
    void case1() {
        // Given
        ConvertStringInteger convertStringInteger = extracted();

        // When
        String str = "1234";
        int expected = 1234;

        // Then
        assertEquals(expected, convertStringInteger.solution(str));

    }

    @Test
    @DisplayName("str이 \"+1234\"이면 1234 반환.")
    void case2() {
        // Given
        ConvertStringInteger convertStringInteger = extracted();

        // When
        String str = "+1234";
        int expected = 1234;

        // Then
        assertEquals(expected, convertStringInteger.solution(str));
    }

    @Test
    @DisplayName("str이 \"-1234\"이면 1234 반환.")
    void case3() {
        // Given
        ConvertStringInteger convertStringInteger = extracted();

        // When
        String str = "-1234";
        int expected = -1234;

        // Then
        assertEquals(expected, convertStringInteger.solution(str));
    }
}
