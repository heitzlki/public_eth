package AnD.algos.test.sort;

public class InsertionSortTest extends AbstractSortTest {
  @Override
  protected int[] sort(int[] array) {
    return AnD.algos.sort.InsertionSort.sort(array);
  }
}
