package Qn4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class NumberUtilsTest {

    @Test
    public void testGetEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        List<Integer> expected = Arrays.asList(2, 4, 6);

        List<Integer> result = NumberUtils.getEvenNumbers(input);

        assertEquals(expected, result);
    }
}
