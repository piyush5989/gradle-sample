/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testJavaVersion() {
        App classUnderTest = new App();
        String javaVersion = System.getProperty("java.version");
        List<Integer> integers = classUnderTest.getIntegers(javaVersion);
        if (javaVersion.equalsIgnoreCase("21.0.2")) {
            assertTrue(integers.size() == 3);
        } else {
            assertTrue(integers.size() == 1);
        }
    }

    @Test
    public void testSpecificJavaVersion() {
        App classUnderTest = new App();
        List<Integer> integers = classUnderTest.getIntegers("21.0.2");
        assertTrue(integers.size() == 3);
    }

    @Test
    public void testStringRepeatJava11() {
        String repeated = "abc".repeat(3);
        assertEquals("abcabcabc", repeated);
    }

    @Test
    public void testJava21() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.addFirst(0);
        list.addLast(2);
        assertEquals("3", list.size());
    }
}
