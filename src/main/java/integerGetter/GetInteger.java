package integerGetter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInteger {

    public static int getInteger() {
        Scanner scanner = new Scanner(System.in);
        int integer;
        boolean error = false;
        while (!error) {
            try {
                integer = scanner.nextInt();
                error = true;
                return integer;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Type integer value!");
            }
        }
        throw new InputMismatchException();
    }

}
