package Algos;
/**
 * LinearSearch
 */
public class LinearSearch {

    // public LinearSearch() {}

    public boolean search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                return true;
            }
        }
        System.out.println("Item " + target + " not found");
        return false;
    }
}