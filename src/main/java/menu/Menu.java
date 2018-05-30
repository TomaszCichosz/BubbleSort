package menu;

import integerGetter.GetInteger;
import menu.subMenus.SubMenuOne;
import menu.subMenus.SubMenuTwo;

public class Menu {

    public static void menuStart() {
        int[] integerArray = new int[]{};
        int[] randomIntegerArray = new int[]{};
        boolean exit = false;
        while (!exit) {
            MenuUtils.mainMenuInformation();
            int decision = GetInteger.getInteger();
            switch (decision) {
                case 1:
                    integerArray = SubMenuOne.subMenuOne(integerArray);
                    break;
                case 2:
                    randomIntegerArray = SubMenuTwo.subMenuTwo(randomIntegerArray);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    MenuUtils.errorMessage();
                    break;
            }

        }
    }

}
