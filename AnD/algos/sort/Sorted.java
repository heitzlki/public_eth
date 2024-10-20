package AnD.algos.sort;

import java.util.Arrays;

public class Sorted {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    boolean result = validate(array);
    System.out.println(Arrays.toString(array) + " is " + (result ? "sorted" : "not sorted"));
  }

  public static boolean validate(int[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] < array[i - 1]) {
        return false;
      }
    }

    return true;
  }
}
