package AnD.algos.test.search;

public class LinearSearchTest extends AbstractSearchTest {
    @Override
    protected int search(int[] array, int target) {
        return AnD.algos.search.LinearSearch.search(array, target);
    }
}
