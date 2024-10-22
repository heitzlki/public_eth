package AnD.algos.sort;


import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] array = {1, 5, 4, 3, 2};
    int[] sorted = sort(Arrays.copyOf(array, array.length));
    System.out.println(Arrays.toString(array) + " --> " + Arrays.toString(sorted));
  }

  public static int[] sort(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    return array;
  }
}
