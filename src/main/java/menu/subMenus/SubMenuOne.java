package menu.subMenus;

import arrays.BubbleSort;
import arrays.IntegerArrayUtils;
import integerGetter.GetInteger;

public class SubMenuOne {

    public static int[] subMenuOne(int[] integerArray) {
        int decision;
        boolean exitFromSubMenu = false;
        while (!exitFromSubMenu) {
            SubMenuUtils.subMenuInformation();
            decision = GetInteger.getInteger();
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
