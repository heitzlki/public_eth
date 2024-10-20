package AnD.algos.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void testTargetPresent() {
        BinarySearch bs = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedIndex = 2;
        int result = bs.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testTargetNotPresent() {
        BinarySearch bs = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int expectedIndex = -1;
        int result = bs.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testEmptyArray() {
        BinarySearch bs = new BinarySearch();
        int[] array = {};
        int target = 3;
        int expectedIndex = -1;
        int result = bs.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testSingleElementArrayTargetPresent() {
        BinarySearch bs = new BinarySearch();
        int[] array = {3};
        int target = 3;
        int expectedIndex = 0;
        int result = bs.search(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testSingleElementArrayTargetNotPresent() {
        BinarySearch bs = new BinarySearch();
        int[] array = {1};
        int target = 3;
        int expectedIndex = -1;
        int result = bs.search(array, target);
        assertEquals(expectedIndex, result);
    }
}