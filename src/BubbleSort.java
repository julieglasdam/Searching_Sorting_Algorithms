/**
 * Created by Julie on 03-05-2017.
 */
public class BubbleSort {
    private int[] array;
    private static long startTime;
    private static long endTime;
    private int times;

    public BubbleSort(){}

    public BubbleSort (int[] array) {
        this.array = array;
        this.times = 0;
    }

    public void sort() {
        startTime = System.currentTimeMillis();
        for (int i = array.length-1; i > 1; i--) { // Iterate through all values in array
            for (int j = 0; j < i; j++) { // Iterate through array again except values that has already been checked
                if (array[j] > array[j+1]) { // Check current value, and next, to see if they should switch places
                     swapValues(j, j+1, array);
                }
                times++;
            }
        }
        endTime = System.currentTimeMillis();
    }

    private void swapValues(int index01, int index02, int[] array) {
        int temp = array[index01];
        array[index01] = array[index02];
        array[index02] = temp;
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
