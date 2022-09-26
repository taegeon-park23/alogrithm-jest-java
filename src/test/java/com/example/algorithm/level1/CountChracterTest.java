package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExecutionTimeLoggerExtension;

@ExtendWith(ExecutionTimeLoggerExtension.class)
class CountChracterTest {

    @Test
    @DisplayName("s가 pPoooyY면 true를 리턴.")
    void case1() {
        // Given
        CountCharacter countCharacter = new CountChracterImpl();

        // When
        String s = "pPoooyY";

        // Then
        assertEquals(true, countCharacter.solution(s));
    }

    @Test
    @DisplayName("s가 Pyy면 false를 리턴.")
    void case2() {
        // Given
        CountCharacter countCharacter = new CountChracterImpl();

        // When
        String s = "Pyy";

        // Then
        assertEquals(false, countCharacter.solution(s));
    }
}