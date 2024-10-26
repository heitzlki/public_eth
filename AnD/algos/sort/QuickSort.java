package AnD.algos.sort;


import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] array = {6, 5, 4, 2, 1, 3};
    int[] sorted = sort(Arrays.copyOf(array, array.length));
    System.out.println(Arrays.toString(array) + " --> " + Arrays.toString(sorted));
  }

  public static int[] sort(int[] array) {
    int[] sortedArray = Arrays.copyOf(array, array.length);
    algo(sortedArray, 0, sortedArray.length - 1);
    return sortedArray;
  }

  static void algo(int[] array, int left, int right) {
    if (left < right) {
      int k = partition(array, left, right);
      algo(array, left, k - 1); // sort left side
      algo(array, k + 1, right); // sort right side
    }
  }

  static int partition(int[] array, int left, int right) {
    int i = left; // set left pointer
    int j = right - 1; // set right pointer, leave oivot
    int pivot = array[right]; // chsoe right-most pivot
    // int pivot = array[left]; // chsoe left-most pivot
    // int pivot = array[(right - left) / 2]; // chsoe middle pivot
    // int pivot = array[(int) (Math.random() * right + left)]; // chsoe random pivot

    do {
      while (i < right && array[i] <= pivot) {
        i++;
      }
      while (j > left && array[j] > pivot) {
        j--;
      }
      if (i <= j) { // swap A[i] and A[j]
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    } while (i < j);

    array[right] = array[i];
    array[i] = pivot;

    return i;
  }
}
