package arrays;

import Utils.ScannerUtils;

import java.util.Random;

public class IntegerArrayUtils {

    public static int[] arrayCreator() {
        System.out.println("Array size:");
        int [] array = new int[ScannerUtils.getInteger()];
        System.out.println("Values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = ScannerUtils.getInteger();
        }
        return array;
    }

    public static int[] randomArrayCreator() {
        System.out.println("Array size:");
        int [] array = new int[ScannerUtils.getInteger()];
        System.out.println("Minimal value:");
        int min = ScannerUtils.getInteger();
        System.out.println("Maximal value:");
        int max = ScannerUtils.getInteger();
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt((max - min) + 1) + min;
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Array:");
        if (array.length == 0) {
            System.out.println("empty");
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
