package AnD.algos.test.sort;

public class BubbleSortTest extends AbstractSortTest {
  @Override
  protected int[] sort(int[] array) {
    return AnD.algos.sort.BubbleSort.sort(array);
  }
}
