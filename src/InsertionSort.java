/**
 * Created by Julie on 06-05-2017.
 */
public class InsertionSort {

    public InsertionSort() {}

    public void sort(int[] array) {
        int temp;

        // Iterate through array, and find the correct index through the sorted elements
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

}
