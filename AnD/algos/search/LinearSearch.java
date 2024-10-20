package AnD.algos.search;

public class LinearSearch {

    // Methode zur Durchführung der linearen Suche
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Zielwert gefunden, Index zurückgeben
            }
        }
        return -1; // Zielwert nicht gefunden
    }

    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int result = search(array, target);
        System.out.println("Index des Zielwerts: " + result);
    }
}
