package Algos;

/**
 * BinarySearch
 */
public class BinarySearch {

    public boolean search(int[] data, int target) {
        
        int start = 0;
        int end = data.length - 1;

        while (end >= start) {
            int mid = (start + end) / 2;

            if (data[mid] == target) {
                return true;
            }
            else if (data[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return false;
    }
}