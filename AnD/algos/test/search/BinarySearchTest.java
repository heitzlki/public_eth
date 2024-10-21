package AnD.algos.test.search;

public class BinarySearchTest extends AbstractSearchTest {
    @Override
    protected int search(int[] array, int target) {
        return AnD.algos.search.BinarySearch.search(array, target);
    }
}
