package arrays;

public class BubbleSort {

    public static IntegerArray bubbleSort(IntegerArray integerArray) {
        for (int i = 0; i < integerArray.array.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < integerArray.array.length - i - 1; j++) {
                if (integerArray.array[j] > integerArray.array[j + 1]) {
                    swap(integerArray.array, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) return integerArray;
        }
        return integerArray;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

}
