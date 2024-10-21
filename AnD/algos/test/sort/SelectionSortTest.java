package AnD.algos.test.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import AnD.algos.sort.SelectionSort;

public class SelectionSortTest {

  @Test
  void testAlreadySortedArray() {
    int[] array = {1, 2, 3, 4, 5};
    int[] expectedArray = {1, 2, 3, 4, 5};
    int[] sortedArray = AnD.algos.sort.SelectionSort.sort(array);
    assertArrayEquals(expectedArray, sortedArray);
  }

  @Test
  void testUnsortedArrayOdd() {
    int[] array = {5, 3, 1, 4, 2};
    int[] expectedArray = {1, 2, 3, 4, 5};
    int[] sortedArray = AnD.algos.sort.SelectionSort.sort(array);
    assertArrayEquals(expectedArray, sortedArray);
  }

  @Test
  void testUnsortedArrayEven() {
    int[] array = {5, 3, 1, 4, 2, 6};
    int[] expectedArray = {1, 2, 3, 4, 5, 6};
    int[] sortedArray = AnD.algos.sort.SelectionSort.sort(array);
    assertArrayEquals(expectedArray, sortedArray);
  }

  @Test
  void testEmptyArray() {
    int[] array = {};
    int[] expectedArray = {};
    int[] sortedArray = AnD.algos.sort.SelectionSort.sort(array);
    assertArrayEquals(expectedArray, sortedArray);
  }

  @Test
  void testSingleElementArray() {
    int[] array = {1};
    int[] expectedArray = {1};
    int[] sortedArray = AnD.algos.sort.SelectionSort.sort(array);
    assertArrayEquals(expectedArray, sortedArray);
  }

  @Test
  void testArrayWithDuplicates() {
    int[] array = {3, 1, 2, 3, 1};
    int[] expectedArray = {1, 1, 2, 3, 3};
    int[] sortedArray = AnD.algos.sort.SelectionSort.sort(array);
    assertArrayEquals(expectedArray, sortedArray);
  }
}
