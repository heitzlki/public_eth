package AnD.algos.test.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import AnD.algos.search.LinearSearch;

class LinearSearchTest {

    @Test
    void testTargetPresent() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedIndex = 2;
        int result = AnD.algos.search.LinearSearch.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testTargetNotPresent() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int expectedIndex = -1;
        int result = AnD.algos.search.LinearSearch.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testEmptyArray() {
        int[] array = {};
        int target = 3;
        int expectedIndex = -1;
        int result = AnD.algos.search.LinearSearch.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testSingleElementArrayTargetPresent() {
        int[] array = {3};
        int target = 3;
        int expectedIndex = 0;
        int result = AnD.algos.search.LinearSearch.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testSingleElementArrayTargetNotPresent() {
        int[] array = {1};
        int target = 3;
        int expectedIndex = -1;
        int result = AnD.algos.search.LinearSearch.search(array, target);
        assertEquals(expectedIndex, result);
    }
}
