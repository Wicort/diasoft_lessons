package ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method;

import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.factory.Dialog;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.factory.HtmlDialog;
import ru.vovchinnikov.diasoft.lessons.patterns.creationalpatterns.factory_method.factory.WindowsDialog;

/**
 * @author Ovchinnikov Viktor
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBuisnesLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBuisnesLogic() {
        dialog.renderWindow();
    }
}
