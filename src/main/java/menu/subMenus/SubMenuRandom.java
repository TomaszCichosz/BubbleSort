package menu.subMenus;

import arrays.BubbleSort;
import arrays.IntegerArrayUtils;
import Utils.ScannerUtils;

public class SubMenuRandom {

    public static int[] subMenuRandom(int[] randomIntegerArray) {
        int decision;
        boolean exitFromSubMenu = false;
        while (!exitFromSubMenu) {
            SubMenuUtils.subMenuInformation();
            decision = ScannerUtils.getInteger();
            switch (decision) {
                case 1:
                    randomIntegerArray = IntegerArrayUtils.randomArrayCreator();
                    break;
                case 2:
                    randomIntegerArray = BubbleSort.bubbleSort(randomIntegerArray);
                    break;
                case 3:
                    IntegerArrayUtils.printArray(randomIntegerArray);
                    break;
                case 0:
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
