package org.webler.zsolt;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class TestAnnotationTypes {

    @BeforeAll
    static void setUpAll() {
        System.out.println("setUpAll method is running.");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setUp method is running.");
    }

    @Test
    void succeedingTest() {
        System.out.println("succeedingTest method is running.");
    }

    @Test
    void failingTest() {
        System.out.println("failingTest method is running.");
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        System.out.println("skippedTest method is running.");
        // not executed
    }

    @Test
    void abortedTest() {
        System.out.println("abortedTest method is running.");
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown method is running.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll method is running.");
    }

}
