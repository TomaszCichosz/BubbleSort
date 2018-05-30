package arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) return array;
        }
        return array;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

}
