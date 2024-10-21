package AnD.algos.test.sort;

public class QuickSortTest extends AbstractSortTest {
  @Override
  protected int[] sort(int[] array) {
    return AnD.algos.sort.QuickSort.sort(array);
  }
}
