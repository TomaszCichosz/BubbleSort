package menu;

import utils.ScannerUtils;
import menu.subMenus.SubMenuManual;
import menu.subMenus.SubMenuRandom;

public class Menu {

    public static void menuStart() {
        final int MANUAL_OPTION = 1;
        final int RANDOM_OPTION = 2;
        final int EXIT_OPTION = 0;

        int[] integerArray = new int[]{};
        int[] randomIntegerArray = new int[]{};
        boolean exit = false;

        while (!exit) {
            MenuUtils.mainMenuInformation();
            int decision = ScannerUtils.getInteger();
            switch (decision) {
                case MANUAL_OPTION:
                    integerArray = SubMenuManual.menu(integerArray);
                    break;
                case RANDOM_OPTION:
                    randomIntegerArray = SubMenuRandom.menu(randomIntegerArray);
                    break;
                case EXIT_OPTION:
                    exit = true;
                    break;
                default:
                    MenuUtils.errorMessage();
                    break;
            }
        }
    }

}
