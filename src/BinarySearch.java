/**
 * Created by Julie on 03-05-2017.
 */
public class BinarySearch {
    private int[] array;
    private int lowIndex;
    private int highIndex;
    private int times;
    private static long startTime;
    private static long endTime;

    public BinarySearch() {}

    public BinarySearch(int[] array) {
        this.array = array;
        this.lowIndex = 0;
        this.highIndex = array.length - 1;
        this.times = 0;
    }

    /* Takes an integer as parameter and finds it in the array. Returns the value's index. -1 if the value isn't in the array
    * Search is logarithmic */
    public int search(int value) {
        startTime = System.currentTimeMillis();
        while(lowIndex <= highIndex) {
            int middleIndex = (lowIndex+highIndex)/2;
            if (array[middleIndex] < value){ // If the value is less than middle value
                lowIndex = middleIndex + 1;
            }
            else if (array[middleIndex] > value) { // If the value is more than middle value
                highIndex = middleIndex - 1;
            }
            else {
                lowIndex = highIndex + 1;
                endTime = System.currentTimeMillis();
                return middleIndex;
            }
            times++;


        }
        endTime = System.currentTimeMillis();
        return -1;
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
