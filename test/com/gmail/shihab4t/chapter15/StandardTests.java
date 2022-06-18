package com.gmail.shihab4t.chapter15;

import org.junit.jupiter.api.*;

public class StandardTests {
    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("After all tests");
    }

    @BeforeEach
    void beforeEachTest(TestInfo testInfo) {
        System.out.printf("About to execute [%s]%n", testInfo.getDisplayName());
    }

    @AfterEach
    void afterEachTEst(TestInfo testInfo) {
        System.out.printf("Finished executing [%s]%n", testInfo.getDisplayName());
    }

    @Test
    void succeedingTest() {
        int a = 4, b = 3;
        Assertions.assertEquals(7, (a + b));
    }

    @Test
    @Disabled("This test is skipped")
    void skippedTest() {

    }

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {

    }

    @Test
    @DisplayName("😃")
    void testWithDisplayNameContainingEmoji(){

    }

    @Test
    @Timeout(5)
    void timeoutTest() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test
    void standardAssertions() {
        Assertions.assertEquals(2, 1 + 1);
        Assertions.assertEquals(4, 2 * 2, "The optional failure message is now the last parameter");
    }
}
