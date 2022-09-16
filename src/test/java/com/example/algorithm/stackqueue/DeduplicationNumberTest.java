package com.example.algorithm.stackqueue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.example.extensions.ExcutionTimeLoggerExtension;

@ExtendWith(ExcutionTimeLoggerExtension.class)
class DeduplicationNumberTest {

    @Test
    @Tag("UNIT_TEST")
    @DisplayName("arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.")
    void case1() {
        int[] expect = { 1, 3, 0, 1 };
        int[] duplicationNumbers = { 1, 1, 3, 3, 0, 1, 1 };

        DeduplicationNumber deduplicationNumber = new DeduplicationNumber();
        assertArrayEquals(expect, deduplicationNumber.solution(duplicationNumbers));
    }

    @Test
    @Tag("UNIT_TEST")
    @DisplayName("arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.")
    void case2() {
        int[] expect = { 4, 3 };
        int[] duplicationNumbers = { 4, 4, 4, 3, 3 };

        DeduplicationNumber deduplicationNumber = new DeduplicationNumber();
        assertArrayEquals(expect, deduplicationNumber.solution(duplicationNumbers));
    }
}