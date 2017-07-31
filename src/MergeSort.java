/**
 * Created by Julie on 06-05-2017.
 */
public class MergeSort {
    private int[] array;
    private int[] temp;
    private int length;


    public  MergeSort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.temp = new int[length];
    }

    public void sort() {
        mergeSort(0, length - 1);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
       // If the array is not empty
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Sort from 0 to middle
            mergeSort(lowerIndex, middle);
            // Sort from middle to the end
            mergeSort(middle + 1, higherIndex);
            // Merge the two parts of the array
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            temp[i] = array[i];
        }

        int j = middle + 1;
        int k = lowerIndex;

        while (lowerIndex <= middle && j <= higherIndex) {
            if (temp[lowerIndex] <= temp[j]) {
                array[k] = temp[lowerIndex];
                lowerIndex++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (lowerIndex <= middle) {
            array[k] = temp[lowerIndex];
            k++;
            lowerIndex++;
        }

    }
}
