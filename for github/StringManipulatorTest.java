package Qn4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {

    @Test
    public void testStringManipulator() {
        StringManipulator manipulator = new StringManipulator();

        assertAll("StringManipulator",
            () -> assertEquals("dcba", manipulator.reverse("abcd")),
            () -> assertEquals("HELLO", manipulator.toUpperCase("hello")),
            () -> assertTrue(manipulator.isPalindrome("A man a plan a canal Panama")),
            () -> assertFalse(manipulator.isPalindrome("hello")),
            () -> assertEquals(3, manipulator.countVowels("hello")),
            () -> assertEquals(5, manipulator.countVowels("A man a plan a canal Panama"))
        );
    }
}
