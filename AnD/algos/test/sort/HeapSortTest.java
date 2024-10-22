package AnD.algos.test.sort;

public class HeapSortTest extends AbstractSortTest {
  @Override
  protected int[] sort(int[] array) {
    return AnD.algos.sort.HeapSort.sort(array);
  }
}
