/**
 * Created by Julie on 07-05-2017.
 */
public class SelectionSort {
    public SelectionSort() {}

    public void sort(int[] array) {
        // Iterate through array
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }
}
