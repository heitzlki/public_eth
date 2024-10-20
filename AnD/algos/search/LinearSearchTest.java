package AnD.algos.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

    @Test
    void testTargetPresent() {
        LinearSearch ls = new LinearSearch();
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedIndex = 2;
        int result = ls.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testTargetNotPresent() {
        LinearSearch ls = new LinearSearch();
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int expectedIndex = -1;
        int result = ls.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testEmptyArray() {
        LinearSearch ls = new LinearSearch();
        int[] array = {};
        int target = 3;
        int expectedIndex = -1;
        int result = ls.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testSingleElementArrayTargetPresent() {
        LinearSearch ls = new LinearSearch();
        int[] array = {3};
        int target = 3;
        int expectedIndex = 0;
        int result = ls.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testSingleElementArrayTargetNotPresent() {
        LinearSearch ls = new LinearSearch();
        int[] array = {1};
        int target = 3;
        int expectedIndex = -1;
        int result = ls.search(array, target);
        assertEquals(expectedIndex, result);
    }
}