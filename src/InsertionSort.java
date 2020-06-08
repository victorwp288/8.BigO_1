public class InsertionSort {

    //Best case = O(n)
    //Average & worst case = O(n^2)
     public void sort(int inputArray[]) {
        int n = inputArray.length;
        for (int i = 1; i < n; ++i) {
            int key = inputArray[i];
            int j = i - 1;

            /* Move elements of inputArray[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && inputArray[j] > key) {
                inputArray[j + 1] = inputArray[j];
                j = j - 1;
            }
            inputArray[j + 1] = key;
        }
    }
}
