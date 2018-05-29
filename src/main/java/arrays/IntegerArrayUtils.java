package arrays;

import java.util.Random;
import java.util.Scanner;

public class IntegerArrayUtils {

    public static IntegerArray arrayCreator(IntegerArray integerArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size:");
        integerArray.array = new int[scanner.nextInt()];
        System.out.println("Values:");
        for (int i = 0; i < integerArray.array.length; i++) {
            integerArray.array[i] = scanner.nextInt();
        }
        return integerArray;
    }

    public static IntegerArray randomArrayCreator(IntegerArray integerArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size:");
        integerArray.array = new int[scanner.nextInt()];
        System.out.println("Minimal value:");
        int min = scanner.nextInt();
        System.out.println("Maximal value:");
        int max = scanner.nextInt();
        Random generator = new Random();
        for (int i = 0; i < integerArray.array.length; i++) {
            integerArray.array[i] = generator.nextInt((max - min) + 1) + min;
        }
        return integerArray;
    }

    public static void printArray(IntegerArray integerArray) {
        System.out.println("Array:");
        if (integerArray.array.length == 0) {
            System.out.println("empty");
        }
        for (int i : integerArray.array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
