/**
 * Created by Julie on 03-05-2017.
 */
public class QuickSort {
    private int[] array;
    private static long startTime;
    private static long endTime;
    private int times; // Not sure where this should be

    public QuickSort() {}

    public QuickSort(int[] array) {
        this.array = array;
        this.times = 0;
    }

    public void sort() {
        startTime = System.currentTimeMillis();
        quickSort(array, 0, array.length - 1);
        endTime = System.currentTimeMillis();
    }

    /* Takes array, and two positions in the array as parameter
    *  The first time this method is called, the parameters first will be 0 (start of array)
    *  and last will be the last index
    * */
    private void quickSort(int[] list, int first, int last) {
        // As long as the the index from the end of the array, being checked, is still larger than the index at the beginning of the array
        if (last > first) {
            int pivotIndex = partition(list, first, last);

            quickSort(list, first, pivotIndex - 1); // Call method, with the last index moved one place to the left
            quickSort(list, pivotIndex + 1, last);
        }

    }

    /* Takes the array as parameter, and the two indexes currently being checked. First time method is
    * called the first index will be 0 and the last index of the array*/
    private int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the value of the first index currently being checked (first time 0) as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search
        while (high > low) {
            // Search forward from left until it finds a value that's greater than the pivot value
            while (low <= high && list[low] >= pivot)
                low++;
            // Search backwards from right until it finds a value that's smaller than the pivot value
            while (low <= high && list[high] < pivot)
                high--;
            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > first && list[high] <= pivot) {
            high--;
        }

        // Swap pivot with list[high]
        if (list[high] < pivot) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }  else {
            return first;
        }
    }

    /* Returns the number of iterations the search took */
    public int numberOfIterations() {
        return times;
    }

    /* Returns the time it took to execute the search */
    public long executionTimeMillis() {
        return endTime - startTime;
    }
}
