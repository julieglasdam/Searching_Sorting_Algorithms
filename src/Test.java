/**
 * Created by Julie on 03-05-2017.
 */
public class Test {
    public static void main(String[] args) {
        int[] hello = {2, 4, 5, 6, 7, 8, 9};
        int[] bla = {1, 6, 7, 3, 8, 3, 10, 0};
        int [] hello2 = new int[5000];


        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(bla);

        for (int i = 0; i < bla.length; i++) {
            System.out.print(bla[i] + " ");
        }

        /*    InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(bla);


        for (int i = 0; i < bla.length; i++) {
            System.out.print(bla[i] + " ");
        }

    /*    int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MergeSort mms = new MergeSort(inputArr);
        mms.sort();

        for (int i = 0; i < inputArr.length; i++){
            System.out.print(inputArr[i] + " ");
        }

   /*     for (int i = 0; i < bla.length; i++) {
            System.out.print(bla[i] + " ");
        }



   /*     for (int i = 0; i < hello2.length; i++){
            hello2[i] = (int)(Math.random()*100)+10;
        }


        BinarySearch binarySearch = new BinarySearch(hello);
        System.out.println(binarySearch.search(3));
        System.out.println(binarySearch.numberOfIterations());

      for (int i = 0; i < hello2.length; i++){
            System.out.print(hello2[i] + " ");
        }
        System.out.println();

        BubbleSort bubbleSort = new BubbleSort(hello2);
        bubbleSort.sort();

      for (int i = 0; i < hello2.length; i++){
            System.out.print(hello2[i] + " ");
        }
        System.out.println();

        System.out.println("Time: " + bubbleSort.executionTimeMillis());
        System.out.println("Iterations: " + bubbleSort.numberOfIterations());

        QuickSort quickSort = new QuickSort(hello2);
        quickSort.sort();

        System.out.println("Time: " + quickSort.executionTimeMillis());
        System.out.println("Iterations: " + quickSort.numberOfIterations()); */

    }
}
