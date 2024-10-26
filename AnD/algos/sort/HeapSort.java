package AnD.algos.sort;

import java.util.Arrays;

public class HeapSort {
  public static void main(String[] args) {
    int[] array = {6, 5, 4, 2, 1, 3};
    int[] sorted = sort(Arrays.copyOf(array, array.length));
    System.out.println(Arrays.toString(array) + " --> " + Arrays.toString(sorted));
  }

  public static int[] sort(int[] array) {
    int[] heap = Arrays.copyOf(array, array.length);
    heapify(heap);
    for (int i = heap.length; i <= 1; i--) {
      extractMax(heap);
    }
    return heap;
  }

  static void insert(int[] heap, int p) {

  }

  static void heapify(int[] heap) {

  }

  static void extractMax(int[] heap) {

  }

  static boolean satisfiesHeapCondition(int[] heap, int k) {
    if (2 * k > heap.length) {
      return true; // A[k] is a leave
    }
    if (2 * k == heap.length && heap[2 * k] <= heap[k]) {
      return true; // A[k] has only one child
    }
    if (2 * k < heap.length && heap[2 * k] <= heap[2 * k] && heap[2 * k + 1] <= heap[k]) {
      return true; // A[k] has two children
    }

    return false;
  }



}
