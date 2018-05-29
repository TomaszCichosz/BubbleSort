package menu;

public class MenuUtils {

    protected static void errorMessage() {
        System.out.println("Wrong command");
    }

    protected static void subMenuInformation() {
        System.out.println("1: Create\n2: Sort\n3: Print\n0: Back");
    }

    protected static void mainMenuInformation() {
        System.out.println("1: Array of integers created manually");
        System.out.println("2: Array of integers created randomly");
        System.out.println("0: Exit");
    }

}
