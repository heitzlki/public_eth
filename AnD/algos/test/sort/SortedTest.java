package AnD.algos.test.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SortedTest {

  @Test
  void testAlreadySortedArray() {
    int[] array = {1, 2, 3, 4, 5};
    boolean expectedResult = true;
    boolean result = AnD.algos.sort.Sorted.validate(array);
    assertEquals(expectedResult, result);
  }

  @Test
  void testUnsortedArray() {
    int[] array = {5, 3, 1, 4, 2};
    boolean expectedResult = false;
    boolean result = AnD.algos.sort.Sorted.validate(array);
    assertEquals(expectedResult, result);
  }

  @Test
  void testEmptyArray() {
    int[] array = {};
    boolean expectedResult = true;
    boolean result = AnD.algos.sort.Sorted.validate(array);
    assertEquals(expectedResult, result);
  }

  @Test
  void testSingleElementArray() {
    int[] array = {1};
    boolean expectedResult = true;
    boolean result = AnD.algos.sort.Sorted.validate(array);
    assertEquals(expectedResult, result);
  }


}
