package arrays;

import java.util.Random;
import java.util.Scanner;

public class IntegerArrayUtils {

    public static IntegerArray arrayCreator(IntegerArray integerArray) throws Exception {
        System.out.println("Array size:");
        integerArray.array = new int[getInteger()];
        System.out.println("Values:");
        for (int i = 0; i < integerArray.array.length; i++) {
            integerArray.array[i] = getInteger();
        }
        return integerArray;
    }

    public static IntegerArray randomArrayCreator(IntegerArray integerArray) throws Exception {
        System.out.println("Array size:");
        integerArray.array = new int[getInteger()];
        System.out.println("Minimal value:");
        int min = getInteger();
        System.out.println("Maximal value:");
        int max = getInteger();
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

    private static int getInteger() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int integer;
        boolean error = false;
        while (!error) {
            try {
                integer = scanner.nextInt();
                error = true;
                return integer;
            } catch (Exception e) {
                scanner.next();
                System.out.println("Type integer value!");
            }
        }
        throw new Exception();
    }

}
