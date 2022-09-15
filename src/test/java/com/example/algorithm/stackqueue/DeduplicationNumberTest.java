package com.example.algorithm.stackqueue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DeduplicationNumberTest {

    @Test
    @Tag("UNIT_TEST")
    @DisplayName("arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1]을 return 합니다.")
    void case1() {
        int[] expect = {1, 3, 0, 1};
        int[] duplicationNumbers = {1, 1, 3, 3, 0, 1, 1};
        
        DeduplicationNumber deduplicationNumber = new DeduplicationNumber();
        assertArrayEquals(expect, deduplicationNumber.solution(duplicationNumbers));
    }
}
