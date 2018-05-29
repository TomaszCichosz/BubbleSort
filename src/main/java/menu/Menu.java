package menu;

import arrays.BubbleSort;
import arrays.IntegerArray;
import arrays.IntegerArrayUtils;

import java.util.Scanner;

public class Menu {
    public static void menuStart() {
        IntegerArray integerArray = new IntegerArray();
        IntegerArray randomIntegerArray = new IntegerArray();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            boolean exitFromSubMenu = false;
            MenuUtils.mainMenuInformation();
            try {
                int decision = scanner.nextInt();
                switch (decision) {
                    case 1:
                        while (!exitFromSubMenu) {
                            MenuUtils.subMenuInformation();
                            try {
                                decision = scanner.nextInt();
                                switch (decision) {
                                    case 1:
                                        IntegerArrayUtils.arrayCreator(integerArray);
                                        break;
                                    case 2:
                                        BubbleSort.bubbleSort(integerArray);
                                        break;
                                    case 3:
                                        IntegerArrayUtils.printArray(integerArray);
                                        break;
                                    case 0:
                                        exitFromSubMenu = true;
                                        break;
                                    default:
                                        MenuUtils.errorMessage();
                                        break;
                                }
                            } catch (Exception e) {
                                scanner.next();
                                MenuUtils.errorMessage();
                            }
                        }
                        break;
                    case 2:
                        while (!exitFromSubMenu) {
                            MenuUtils.subMenuInformation();
                            try {
                                decision = scanner.nextInt();
                                switch (decision) {
                                    case 1:
                                        IntegerArrayUtils.randomArrayCreator(randomIntegerArray);
                                        break;
                                    case 2:
                                        BubbleSort.bubbleSort(randomIntegerArray);
                                        break;
                                    case 3:
                                        IntegerArrayUtils.printArray(randomIntegerArray);
                                        break;
                                    case 0:
                                        exitFromSubMenu = true;
                                        break;
                                    default:
                                        MenuUtils.errorMessage();
                                        break;
                                }
                            } catch (Exception e) {
                                scanner.next();
                                MenuUtils.errorMessage();
                            }
                        }
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        MenuUtils.errorMessage();
                        break;
                }
            } catch (Exception e) {
                scanner.next();
                MenuUtils.errorMessage();
            }
        }
    }
}
