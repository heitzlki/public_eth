package AnD.algos.test.sort;

public class MergeSortTest extends AbstractSortTest {
  @Override
  protected int[] sort(int[] array) {
    return AnD.algos.sort.MergeSort.sort(array);
  }
}
