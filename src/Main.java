import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();

        int[] test = {5,9,8,1,2,3,6,7,4};
        System.out.println("Array før sortering: " + Arrays.toString(test));

        bubbleSort.bubbleSort(test);
        System.out.println("Array efter 'bubble sort': " + Arrays.toString(test));

        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Collections.shuffle(Arrays.asList(array));

        double startTid = System.nanoTime();
        bubbleSort.bubbleSort(array);
        double slutTid = System.nanoTime();
        System.out.println("'Bubble sort' på array med 10000 indexes tog: " + (slutTid - startTid)/1000000000 + " sekunder");


        System.out.println("----------------------------------------------------------------");


        int[] insertionTest = {5,9,8,1,2,3,6,7,4};
        System.out.println("Array før sortering: " + Arrays.toString(insertionTest));

        insertionSort.sort(test);
        System.out.println("Array efter 'insertionsort': " + Arrays.toString(test));

        Collections.shuffle(Arrays.asList(array));

        double startTid1 = System.nanoTime();
        insertionSort.sort(array);
        double slutTid1 = System.nanoTime();
        System.out.println("'Insertion sort' på array med 10000 indexes tog: " + (slutTid1 - startTid1)/100000000 + " sekunder");


        System.out.println("----------------------------------------------------------------");


        int[] selectionTest = {5,9,8,1,2,3,6,7,4};
        System.out.println("Array før sortering: " + Arrays.toString(selectionTest));

        insertionSort.sort(test);
        System.out.println("Array efter 'selection sort': " + Arrays.toString(test));

        Collections.shuffle(Arrays.asList(array));

        double startTid2 = System.nanoTime();
        selectionSort.selectionSort(array);
        double slutTid2 = System.nanoTime();
        System.out.println("'Selection sort' på array med 10000 indexes tog: " + (slutTid2 - startTid2)/100000000 + " sekunder");

    }
}
