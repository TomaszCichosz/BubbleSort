package menu.subMenus;

import arrays.BubbleSort;
import arrays.IntegerArrayUtils;
import Utils.ScannerUtils;

public class SubMenuRandom {

    public static int[] menu(int[] randomIntegerArray) {
        final int CREATE_OPTION = 1;
        final int SORT_OPTION = 2;
        final int PRINT_OPTION = 3;
        final int EXIT_OPTION = 0;

        int decision;
        boolean exitFromSubMenu = false;

        while (!exitFromSubMenu) {
            SubMenuUtils.subMenuInformation();
            decision = ScannerUtils.getInteger();
            switch (decision) {
                case CREATE_OPTION:
                    randomIntegerArray = IntegerArrayUtils.randomArrayCreator();
                    break;
                case SORT_OPTION:
                    randomIntegerArray = BubbleSort.sort(randomIntegerArray);
                    break;
                case PRINT_OPTION:
                    IntegerArrayUtils.printArray(randomIntegerArray);
                    break;
                case EXIT_OPTION:
                    exitFromSubMenu = true;
                    break;
                default:
                    SubMenuUtils.errorMessage();
                    break;
            }
        }
        return randomIntegerArray;
    }

}
