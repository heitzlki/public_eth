package AnD.algos.search;

public class BinarySearch {
  public static int search(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      int middle = (left + right) / 2;
      if (array[middle] == target) {
        return middle;
      } else if (array[middle] > target) {
        right = middle - 1;
      } else {
        left = middle + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int target = 3;
    int result = search(array, target);
    System.out.println("Index des Zielwerts: " + result);
  }


}
