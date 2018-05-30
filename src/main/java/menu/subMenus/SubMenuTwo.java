package menu.subMenus;

import arrays.BubbleSort;
import arrays.IntegerArrayUtils;
import integerGetter.GetInteger;

public class SubMenuTwo {

    public static int[] subMenuTwo(int[] randomIntegerArray) {
        int decision;
        boolean exitFromSubMenu = false;
        while (!exitFromSubMenu) {
            SubMenuUtils.subMenuInformation();
            decision = GetInteger.getInteger();
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
