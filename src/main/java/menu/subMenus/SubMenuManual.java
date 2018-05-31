package menu.subMenus;

import arrays.BubbleSort;
import arrays.IntegerArrayUtils;
import Utils.ScannerUtils;

public class SubMenuManual {

    public static int[] subMenuManual(int[] integerArray) {
        int decision;
        boolean exitFromSubMenu = false;
        while (!exitFromSubMenu) {
            SubMenuUtils.subMenuInformation();
            decision = ScannerUtils.getInteger();
            switch (decision) {
                case 1:
                    integerArray = IntegerArrayUtils.arrayCreator();
                    break;
                case 2:
                    integerArray = BubbleSort.bubbleSort(integerArray);
                    break;
                case 3:
                    IntegerArrayUtils.printArray(integerArray);
                    break;
                case 0:
                    exitFromSubMenu = true;
                    break;
                default:
                    SubMenuUtils.errorMessage();
                    break;
            }
        }
        return integerArray;
    }

}
