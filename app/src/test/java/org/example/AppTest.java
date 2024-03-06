/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    public void testJavaVersion() {
        App classUnderTest = new App();
        List<Integer> integers = classUnderTest.getIntegers("21.0.2");
        assertTrue(integers.size() == 3);

        integers = classUnderTest.getIntegers("1.8");
        assertTrue(integers.size() == 1);
    }
}
