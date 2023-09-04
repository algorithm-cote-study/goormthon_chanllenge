package com.goorm.week4.day1.songju;

import com.goorm.common.TestFileUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("연합 - 송주")
class SolutionTest {
    @Test
    @DisplayName("연합 - 케이스1")
    void test_case_1() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week4/day1/test_case1.txt");
        int solution = Solution.solution(reader);
        assertEquals(3, solution);
    }

    @Test
    @DisplayName("연합 - 케이스2")
    void test_case_2() throws Exception {
        BufferedReader reader = TestFileUtil.getReader(this.getClass(), "testcase/week4/day1/test_case2.txt");
        int solution = Solution.solution(reader);
        assertEquals(1, solution);
    }

}