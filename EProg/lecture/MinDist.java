package EProg.lecture;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinDist {

  public static void main(String[] args) {
    int[] A = {1, 3, 5, 1, 1, 3, 7};
    System.out.println(minimumDistance(A.length, A)); // 4

    int[] B = {1};
    System.out.println(minimumDistance(B.length, B)); // 0

    int[] C = {1};
    System.out.println(minimumDistance(C.length, C)); // 0

    int[] D = {1, 2, 3, 4};
    System.out.println(minimumDistance(D.length, D)); // 3

    int[] E = {1, 1, 2, 2, 3, 3, 4, 4};
    System.out.println(minimumDistance(E.length, E)); // 6

    int[] E2 = {4, 3, 4, 3, 2, 1, 2, 1};
    System.out.println(minimumDistance(E2.length, E2)); // 6

    int[] F = {1, 1, 2, 2, 2};
    System.out.println(minimumDistance(F.length, F)); // 2

    int[] G = {1, 1, 1, 4, 4, 4};
    System.out.println(minimumDistance(G.length, G)); // 3

    int[] H = {2, 2, 1, 1};
    System.out.println(minimumDistance(H.length, H)); // 2
  }

  public static int minimumDistance(int n, int[] A) {
    MergeSort(A);

    int sameCounter = 1, maxSame = 1;

    for (int i = 1; i < n; i++) {
      if (A[i] == A[i - 1]) {
        sameCounter++;
      } else {
        maxSame = Math.max(maxSame, sameCounter);
        sameCounter = 1;
      }
    }

    return n - Math.max(maxSame, sameCounter);
  }

  public static void Merge(int[] A, int[] left, int[] right) {

    int i = 0, j = 0, k = 0, leftLength = left.length, rightLength = right.length;

    while (i < leftLength && j < rightLength) {
      if (left[i] <= right[j]) {
        A[k++] = left[i++];
      } else {
        A[k++] = right[j++];
      }
    }
    while (i < leftLength) {
      A[k++] = left[i++];
    }
    while (j < rightLength) {
      A[k++] = right[j++];
    }

  }


  public static void MergeSort(int[] A) {
    int n = A.length;

    if (n <= 1) {
      return;
    }

    int mid = n / 2;

    int[] left = new int[mid];
    int[] right = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      left[i] = A[i];
    }
    for (int i = mid; i < n; i++) {
      right[i - mid] = A[i];
    }

    MergeSort(left);
    MergeSort(right);

    Merge(A, left, right);
  }


}
