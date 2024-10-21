package AnD.algos.test.sort;

public class SelectionSort extends AbstractSortTest {
  @Override
  protected int[] sort(int[] array) {
    return AnD.algos.sort.SelectionSort.sort(array);
  }
}
