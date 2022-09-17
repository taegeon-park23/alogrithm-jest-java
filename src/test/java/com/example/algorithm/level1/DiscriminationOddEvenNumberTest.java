package com.example.algorithm.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExcutionTimeLoggerExtension;

@ExtendWith(ExcutionTimeLoggerExtension.class)
class DiscriminationOddEvenNumberTest {

    @Test
    @DisplayName("3은 \"Odd\"를 반환합니다.")
    void case1() {
        // Given
        DiscriminationOddEvenNumber discriminationOddEvenNumber = new DiscriminationOddEvenNumberImpl();

        // When
        int number = 3;

        // Then
        assertEquals("Odd", discriminationOddEvenNumber.solution(number));
    }

    @Test
    @DisplayName("4는 \"Even\"를 반환합니다.")
    void case2() {
        // Given
        DiscriminationOddEvenNumber discriminationOddEvenNumber = new DiscriminationOddEvenNumberImpl();

        // When
        int number = 4;

        // Then
        assertEquals("Even", discriminationOddEvenNumber.solution(number));
    }

    @Test
    @DisplayName("0는 \"Even\"를 반환합니다.")
    void case3() {
        // Given
        DiscriminationOddEvenNumber discriminationOddEvenNumber = new DiscriminationOddEvenNumberImpl();

        // When
        int number = 0;

        // Then
        assertEquals("Even", discriminationOddEvenNumber.solution(number));
    }
}
