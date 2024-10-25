package EProg.lecture;

public class SubarrayNegElements {
  public static void main(String[] args) {
    int[] A = {-3, -4, 8, 4, -1, 6, 4, -2, -5, 2};
    System.out.println(longestSubarray(10, A));
  }

  public static int longestSubarray(int n, int[] A) {
    int count = 0;
    int highestCount = 0;
    int negIndexOne = -1;
    int negIndexTwo = -1;

    for (int i = 0; i < n; i++) {
      count++;

      if (A[i] < 0) {
        if (negIndexOne != -1 && negIndexTwo != -1) {
          count = i - negIndexOne;
          negIndexOne = negIndexTwo;
          negIndexTwo = i;
        } else if (negIndexOne == -1) {
          negIndexOne = i;
        } else {
          negIndexTwo = i;
        }
      }

      highestCount = Math.max(highestCount, count);
    }

    return highestCount;
  }
}
